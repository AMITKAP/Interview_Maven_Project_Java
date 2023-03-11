import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.*;

public class ArrayListPractice
{
      private static ArrayList<String> arrayListObj1;
      private static ArrayList<String> arrayListObj2;
      private static ListIterator<String> lItr;

      @BeforeTest
      public void CreateArrayList()
      {
            arrayListObj1= new ArrayList<String>();
            arrayListObj2= new ArrayList<String>();
            arrayListObj1.add("Hi");
            arrayListObj1.add(1,"I'm ArrayList");
      }

      @Test
      public static void PrintArrayListSize()
      {
          System.out.println(arrayListObj1.size());

      }
    @Test
    public static void addListToAnotherArrayList()
    {
        arrayListObj2.add("RamiKapor");
        arrayListObj2.addAll(arrayListObj1);
        System.out.println(arrayListObj2);
    }
    @Test
    public static void displayingArrayListEle()
    {

        for(String str:arrayListObj1)
        {
            System.out.println(str);
        }

    }
    @Test
    public static void listIteratorTraverse()
    {

         lItr= arrayListObj1.listIterator();
         while(lItr.hasNext())
         {
             System.out.println(lItr.next());
             lItr.add("Pandey");
         }

        while(lItr.hasPrevious())
        {
            System.out.println(lItr.previous());
        }

    }


}
