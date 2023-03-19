import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumPractice {
    private static WebDriver driver;

    @BeforeTest
    public static void driverSetup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/select-menu");
    }

    @Test
    public static void selectDropDown() {

        WebElement el = driver.findElement(By.id("oldSelectMenu"));
        Select sel = new Select(el);
        System.out.println(sel.getFirstSelectedOption().getText());
        System.out.println(sel.getAllSelectedOptions());
        System.out.println(sel.getOptions());
        sel.selectByIndex(2);
        sel.selectByVisibleText("Red");
        sel.selectByValue("8");
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

    @Test
    public static void openingMultipleTabs()
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @Test
    public static void getWindowHandles()
    {

        driver.getWindowHandles();
        driver.getWindowHandle();

    }

    @Test
    public static void takingElemScreenShot()
    {

       File src= driver.findElement(By.id("")).getScreenshotAs(OutputType.FILE);

    }
}