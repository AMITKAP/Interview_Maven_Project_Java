import org.testng.annotations.Test;

public class StringPractice
{

    private static String str1,str2;
    private static StringBuilder builder;

     StringPractice()

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

        String str1="amit kapoor";
        String str2="amit kapoor";
        String str3= new String("amit kapoor");
        String str4= new String("amit");


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


}
