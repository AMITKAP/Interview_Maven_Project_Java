package JavaLanguage;

import org.testng.annotations.Test;

import java.util.StringTokenizer;

public class String
{

    private static java.lang.String str1,str2;
    private static StringBuilder builder;

     String()

     {
         str1="amit kap";
         str2="sum kap";
         builder=new StringBuilder("amit");
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

    @Test
    public static void stringBuilderAppend()
    {
        System.out.println(builder.append("kap"));
    }

    @Test
    public static void stringBuilderInsert()
    {
        System.out.println(builder.insert(1,"sum"));
    }

    @Test
    public static void stringBuilderDelete()
    {
        System.out.println(builder.delete(1,2));
    }

    @Test
    public static void stringBuilderReverse()
    {
        System.out.println(builder.reverse());
    }

    @Test
    public static void stringBuilderReplace()
    {
        System.out.println(builder.replace(1,2,"a"));
    }

    @Test
    public static void setCharacterAt()
    {
        builder.setCharAt(1,'a');
        System.out.println(builder);
    }

    @Test
    public static void deleteCharacterAt()
    {
        builder.deleteCharAt(1);
        System.out.println(builder);
    }

    @Test
    public static void stringsComp()
    {

        java.lang.String str1="amit kapoor";
        java.lang.String str2="amit kapoor";
        java.lang.String str3= new java.lang.String("amit kapoor");
        java.lang.String str4= new java.lang.String("amit");


        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println("-------------------");
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);
        System.out.println("-------------------");
        System.out.println(str1.compareTo(str4));

    }

    @Test
    public void indexOf()
    {
        System.out.println(str1.indexOf("amit"));
        System.out.println(str1.indexOf("amit",2));
        System.out.println(str1.lastIndexOf("amit"));
        System.out.println(str1.lastIndexOf("amit",2));
    }

    @Test
    public void subString()
    {
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(0,2));
    }

    @Test
    public void charAt()
    {
      System.out.println(str1.charAt(0));
    }

    @Test
    public void startsWith()
    {
        System.out.println(str1.startsWith("a"));
        System.out.println(str1.endsWith("b"));
    }

    @Test
    public void stringTokenizer()
    {
        java.lang.String test="amit@kapoor";
        StringTokenizer token= new StringTokenizer(test,"@");

        while ((token.hasMoreTokens()))
        {
            System.out.println(token.nextToken());
        }


    }

    @Test
    public void stringsEquals()
    {
        java.lang.String test ="ab";
        java.lang.String test1 ="ba";

        System.out.println(test1.equals(test));
    }

}


