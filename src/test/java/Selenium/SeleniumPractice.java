package Selenium;

import TestNGPractice.retryAnalyzer;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class SeleniumPractice {
    private static WebDriver driver;
    private static String reportPath ;

    private static ExtentReports rep;
    private static ThreadLocal<ExtentTest> tL;

    @BeforeTest
    @Parameters({"BrowserName"})
    public static void driverSetup(String bRName)
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/select-menu");
        System.out.println(bRName);
        reportPath=System.getProperty("user.dir")+"\\reports\\report.html";
        ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
        reporter.config().setReportName("Test1");
        reporter.config().setDocumentTitle("Test Title");
        rep=new ExtentReports();
        rep.attachReporter(reporter);
        rep.setSystemInfo("Sys","Info");


    }

    @Test(retryAnalyzer = retryAnalyzer.class)
    public static void selectDropDown() {

        ExtentTest test =rep.createTest("Test");
        WebElement el = driver.findElement(By.id("oldSelectMenu"));
        Select sel = new Select(el);
        System.out.println(sel.getFirstSelectedOption().getText());
        System.out.println(sel.getAllSelectedOptions());
        System.out.println(sel.getOptions());
        sel.selectByIndex(2);
        sel.selectByVisibleText("Red");
        sel.selectByValue("8");
        test.log(Status.PASS,"test finished");
        tL.set(test);
        tL.get();
        rep.flush();
    }

    @Test
    public static void deselectDropDown() {

        WebElement el = driver.findElement(By.id("oldSelectMenu"));
        Select sel = new Select(el);
        sel.deselectAll();
        sel.deselectByVisibleText("Red");
        sel.selectByValue("8");
    }

    @AfterTest
    public static void driverQuit() {
        driver.quit();
    }

    @Test
    public static void takingScreenShots() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:/ak.png"));
    }

    @Test
    public static void takingScreenShotsWhileScrolling() throws IOException {

        new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

    }

    @Test
    public static void brokenLinks() throws IOException {

        String url = "";
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.connect();
        con.getResponseCode();
    }

    @Test
    public static void softAssert()
    {

      SoftAssert soft= new SoftAssert();
      soft.assertTrue(1>2);
      soft.assertAll();
    }

    @Test(dependsOnGroups ={"Smoke","Regression"})
    public static void openingMultipleTabsAndSwitching()
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().defaultContent();
    }

    @Test(dependsOnMethods ={"takingElemScreenShot","getEleDimension"})
    public void getWindowHandles()
    {

        driver.getWindowHandles();
        driver.getWindowHandle();

    }

    @Test(groups = "Smoke")
    public static void takingElemScreenShot()
    {

       File src= driver.findElement(By.id("")).getScreenshotAs(OutputType.FILE);

    }
    @Test
    public static void getEleDimension()
    {

        int h= driver.findElement(By.id("")).getRect().getDimension().height;
        int hi= driver.findElement(By.id("")).getRect().getDimension().getHeight();
        int w= driver.findElement(By.id("")).getRect().getDimension().width;
        int wi= driver.findElement(By.id("")).getRect().getDimension().getWidth();

    }
    @Test
    public static void relativeLocators()
    {

        RelativeLocator.with(By.id("")).above(By.className(""));
        RelativeLocator.with(By.id("")).below(By.className(""));
        RelativeLocator.with(By.id("")).near(By.className(""));

    }
    @Test
    public static void switchToFrame()
    {
        driver.switchTo().frame(0);
        driver.switchTo().frame("frame name or id");
        driver.switchTo().frame(driver.findElement(By.id("")));
        driver.switchTo().parentFrame();
    }

    @Test
    public static void actionClass()
    {
       Actions act= new Actions(driver);
       act.clickAndHold(driver.findElement(By.id(""))).build().perform();
       act.dragAndDrop(driver.findElement(By.id("")),driver.findElement(By.id("")));
       act.doubleClick();
       act.contextClick();
       act.moveToElement(driver.findElement(By.id("")));
    }
}