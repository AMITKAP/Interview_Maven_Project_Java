import org.testng.annotations.Test;
import java.util.*;

public class ArrayListPractice
{

      private static ArrayList<String> arrayListObj1;
      private static ArrayList<String> arrayListObj2;
      ArrayListPractice()
      {
            arrayListObj1= new ArrayList<String>();
            arrayListObj2= new ArrayList<String>();
      }

      @Test
      public static void addElementToArrayList()
      {
          System.out.println(arrayListObj1.size());
          arrayListObj1.add("Amit");
          arrayListObj1.add(1,"Kapoor");
          System.out.println(arrayListObj1.size());

      }
    @Test
    public static void addListToAnotherArrayList()
    {

        arrayListObj2.add("Ramit");
        arrayListObj1.add("Ram");
        arrayListObj1.add(1,"Kapoor");
        arrayListObj2.addAll(arrayListObj1);
        System.out.println(arrayListObj2);

    }

    @Test
    public static void displayingArrayListEle()
    {

        addElementToArrayList();
        for(String str:arrayListObj1)
        {
            System.out.println(str);
        }

    }

}
