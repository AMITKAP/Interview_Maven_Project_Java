import org.testng.annotations.Test;

public class Enum
{

    public enum SEASON
    {
        WINTER, SPRING, SUMMER, FALL
    }

    @Test
    public void enumTest()
    {
        for(SEASON str:SEASON.values())
        {
           System.out.println("Enum Index="+str.ordinal());
           System.out.println("Enum Value="+str.toString());
           System.out.println("---------------------------");
        }
    }



}
