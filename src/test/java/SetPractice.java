import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.HashSet;
import java.util.Iterator;

public class SetPractice
{

      private static HashSet<String> hS1;
      private static HashSet<String> hS2;
      SetPractice()
      {
          hS1=new HashSet<String>();
          hS2=new HashSet<String>();
      }

      @BeforeTest
      public static void addElements()
      {

          hS1.clear();
          hS2.clear();
          hS1.add("amit");
          hS1.add("sumit");
          hS1.add("sunita");
          hS1.add(null);
          hS1.add(null);
          hS2.add("amit");
          hS2.add("sumit");
          hS2.add("sunita");
      }

      @Test
      public static void printingElements()
      {
        System.out.println(hS1);
      }

    @Test
    public static void eleIterationThroughForEach()
    {

        for(String str:hS1)
        {
            System.out.println(str);
        }

    }

    @Test
    public static void eleIterator()
    {

        Iterator<String> itStr=hS1.iterator();

        while (itStr.hasNext())
       {
           System.out.println(itStr.next());
       }

    }

    @Test
    public static void retainAll()
    {
       System.out.println(hS1.retainAll(hS2));
       System.out.println(hS1);
    }

    @Test
    public static void removeAll()
    {
        System.out.println(hS1.removeAll(hS2));
        System.out.println(hS1);
    }

    @Test
    public static void checkExist()
    {

        System.out.println(hS1.contains("amit"));
    }

    @Test
    public static void sizeFunction()
    {
        System.out.println(hS1.size());

    }
    @Test
    public static void removeFunction()
    {
        System.out.println(hS1.remove("amit"));

    }

    @Test
    public static void arrayFunction()
    {

        for(Object str:hS1.toArray())
        System.out.println(str);

    }

}
