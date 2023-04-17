package TestNGPractice;

import TestNGPractice.TestNgListner;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

@Listeners(TestNgListner.class)
public class TestNgPractice
{

    @Test(dataProvider = "testing")
    public void test(String val,String val1)
    {
            System.out.println(val);
            System.out.println(val1);
    }

    @DataProvider(name = "testing")
    public Object[][] dp()
    {
        return new Object[][]{{"First-Value","Second-Value"},{"third-Value","Fourth-Value"}};
    }

    @Test
    public void iTestResults(ITestResult res)
    {
           System.out.println(res.getThrowable());
           System.out.println(res.getMethod().getMethodName());
           if(res.getStatus()==ITestResult.FAILURE)
           {
               System.out.println("Failed");
           }
          if(res.getStatus()==ITestResult.SUCCESS)
          {
            System.out.println("Failed");
          }
    }

    @Test(groups ={"Smoke"})
    public void grpAnotationTest()
    {

        System.out.println("I'm grp smoke test");

    }

    @Test(dependsOnGroups ="Smoke")
    public void dependentsOnGrpTest()
    {

        System.out.println("I'm depends on grp smoke test");

    }

    @Test
    public void optionalPram(@Optional String param)
    {
        System.out.println(param);
    }

    @Test(invocationCount = 1,enabled = false,threadPoolSize = 1)
    public void invocationCnt()
    {
        System.out.println("I'm");

    }

    @Test(expectedExceptions ={IndexOutOfBoundsException.class} )
    public void throwingExceptions()
    {

        throw new IndexOutOfBoundsException();
    }

}
