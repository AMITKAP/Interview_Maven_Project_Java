import org.testng.annotations.Test;
import java.util.regex.*;

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
        System.out.println(mat.group());

       }
       System.out.println(count);

    }

    @Test
    public void regularExpReplaceAll()
    {
        String str="0123";
        String str1=str.replaceAll("[0-9]","a");
        String str2=str.replaceAll("\\d","a");
        System.out.println(str1);
    }

    @Test
    public void regularExpEitherABC ()
    {
        String test="001c";

        Pattern pat=Pattern.compile("[abc]");
        Matcher match=pat.matcher(test);

        while (match.find())
        {
            System.out.println(match.start());
            System.out.println(match.end());
        }

    }

    @Test
    public void regularExpExceptABC()
    {
        String test="001c";

        Pattern pat=Pattern.compile("[^abc]");
        Matcher match=pat.matcher(test);

        while (match.find())
        {
            System.out.println("Start Index="+match.start());
            System.out.println("End Index="+match.end());
            System.out.println("----------------------------");
        }

    }

    @Test
    public void regularExpDigit()
    {
        String test="001c";

        Pattern pat=Pattern.compile("\\d");
        Matcher match=pat.matcher(test);

        while (match.find())
        {
            System.out.println("Start Index="+match.start());
            System.out.println("End Index="+match.end());
            System.out.println("Pat Or Character="+match.group());
            System.out.println("----------------------------");
        }

    }

    @Test
    public void regularExpSpecialCharacter()
    {
        String test="001c@@!";

        Pattern pat=Pattern.compile("\\W");
        Matcher match=pat.matcher(test);

        while (match.find())
        {
            System.out.println("Start Index="+match.start());
            System.out.println("End Index="+match.end());
            System.out.println("Pat Or Character="+match.group());
            System.out.println("----------------------------");
        }

    }
}
