package TestNGPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListner implements ITestListener
{
    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("I'm from listner class");
    }
}
