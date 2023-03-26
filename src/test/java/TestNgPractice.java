import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

}
