package JavaLanguage;

import org.testng.annotations.Test;
import java.util.regex.*;
import java.lang.String;

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
        java.lang.String str="0123";
        java.lang.String str1=str.replaceAll("[0-9]","a");
        java.lang.String str2=str.replaceAll("\\d","a");
        System.out.println(str1);
    }

    @Test
    public void regularExpEitherABC ()
    {
        java.lang.String test="001c";

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

    @Test
    public void regularExpSpecialDotCharacter()
    {
        String test="001c@@!";

        Pattern pat=Pattern.compile(".");
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
    public void regularEx()
    {
       String test="^1^9=8=9=14";
       String regEx="^[\\^]1[\\^][8][\\=][9][\\=]14$";

       Pattern pat=Pattern.compile(regEx);
       Matcher match=pat.matcher(test);

        System.out.println("Found="+test.matches(regEx));
        while (match.find())
        {
            System.out.println("Start Index="+match.start());
            System.out.println("End Index="+match.end());
            System.out.println("Pat Or Character="+match.group());
            System.out.println("----------------------------");
        }
    }

    @Test
    public void logicalOrOperatorRegEx()
    {

        String test="^8=12^8=234^35=9^10=5123";
        String pattern="\\^8|\\^35|(\\^10=[0-9]+$)";

        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(test);

        while (match.find())
        {
            System.out.println("Start Index="+match.start());
            System.out.println("End Index="+(match.end()-1));
            System.out.println("Patter Or Character matched="+match.group());
            System.out.println("----------------------------");
        }

    }
}
