package JavaLanguage;

import org.testng.annotations.Test;
import java.lang.String;

public class WrapperClass
{

    private static Integer i=0;
    WrapperClass()
    {
        Integer i=10;
        Integer obj= new Integer(i);
    }

    @Test
    public static void printTypeOfObject()
    {

        System.out.println(i.getClass());


    }
    @Test
    public static void valueOfFunctionBoxing()
    {

       Integer valObj=Integer.valueOf(10);
       Integer valString=Integer.valueOf("10");

    }

    @Test
    public static void xValueUnboxingFunction()
    {
       int val= i.intValue();

    }

    @Test
    public static void StringToInteger()
    {
        String str="100";
        int val=Integer.parseInt(str);
        Integer valString=Integer.valueOf("10");
    }

    @Test
    public static void IntegerToString()
    {
         int i=100;

         String val= Integer.toString(i);
         String valCon=String.valueOf(i);


    }
}
