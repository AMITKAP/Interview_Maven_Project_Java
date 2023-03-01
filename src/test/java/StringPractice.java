import org.testng.annotations.Test;

public class StringPractice
{

    private static String str1,str2;

     StringPractice()

     {
         str1="amit kap";
         str2="sum kap";
     }

     @Test
     public static void stringLength()
     {
         System.out.println(str1.length());
     }

    @Test
    public static void stringUpperCase()
    {
        System.out.println(str1.toUpperCase());
    }

    @Test
    public static void stringLowerCase()
    {
        System.out.println(str1.toLowerCase());
    }

    @Test
    public static void stringReplaceMethod()
    {
        System.out.println(str1.replace("a","b"));
        System.out.println(str1);
    }

    @Test
    public static void stringReplaceFirst()
    {
        System.out.println(str1.replaceFirst("a","b"));
    }
    @Test
    public static void stringReplaceAllMethod()
    {
        System.out.println(str1.replaceAll("a","b"));
        System.out.println(str1.replaceAll("\\s",""));
    }

    @Test
    public static void stringArrayConv()
    {

      char[] ch=  str1.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
          System.out.println(ch[i]);
      }
    }
    @Test
    public static void stringConcat()
    {
        System.out.println(str1.concat(str2));
    }


}
