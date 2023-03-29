import org.testng.annotations.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression
{

    @Test
    public void regularExp()
    {

       int count=0;
       Pattern pat= Pattern.compile("ab");
       Matcher mat=pat.matcher("abaababc");

       while(mat.find())
       {
        count++;
        System.out.println(mat.start());
        System.out.println(mat.end());

       }
       System.out.println(count);

       pat.split("\\.");
       pat.split("[.]");

    }

    @Test
    public void regularExpReplaceAll()
    {
        String str="0123";
        String str1=str.replaceAll("[0-9]","a");
        String str2=str.replaceAll("\\d","a");
        System.out.println(str1);
    }

}
