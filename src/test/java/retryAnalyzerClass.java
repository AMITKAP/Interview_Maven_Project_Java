import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzerClass implements IRetryAnalyzer
{
    int retryCnt=2;
    int count=0;
    @Override
    public boolean retry(ITestResult result)
    {

        while(count<retryCnt)
        {
            count++;
        }
        return false;
    }
}
