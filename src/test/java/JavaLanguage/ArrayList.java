package JavaLanguage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.String;
import java.util.*;
import java.lang.*;

public class ArrayList
{
      private static java.util.ArrayList<java.lang.String> arrayListObj1;
      private static java.util.ArrayList<java.lang.String> arrayListObj2;
      private static ListIterator<String> lItr;

      @BeforeTest
      public void CreateArrayList()
      {
            arrayListObj1= new java.util.ArrayList<java.lang.String>();
            arrayListObj2= new java.util.ArrayList<java.lang.String>();
            arrayListObj1.add("ai");
            arrayListObj1.add(1,"I'm ArrayList");
            arrayListObj1.add("I'm");
            arrayListObj1.add("Hi");
      }

    @AfterTest
    public void ClearArrayList()
    {
        arrayListObj1.clear();
        arrayListObj2.clear();
    }

      @Test
      public static void printArrayListSize()
      {
          System.out.println(arrayListObj1.size());

      }

    @Test
    public static void isEmpty()
    {
        System.out.println(arrayListObj1.isEmpty());
    }
    @Test
    public static void addListToAnotherArrayList()
    {
        arrayListObj2.add("RamiKapor");
        arrayListObj2.addAll(arrayListObj1);
        System.out.println(arrayListObj2);
    }

    @Test
    public static void remove()
    {
        System.out.println(arrayListObj1.remove(1));
        System.out.println(arrayListObj1.remove("Hi"));
        System.out.println(arrayListObj1.removeAll(arrayListObj2));
    }

    @Test
    public static void get()
    {
        System.out.println(arrayListObj1.get(1));
    }

    @Test
    public static void getIndexOf()
    {
        System.out.println(arrayListObj1.indexOf("Hi"));
        System.out.println(arrayListObj1.lastIndexOf("Hi"));
    }

    @Test
    public static void displayingArrayListEle()
    {

        for(java.lang.String str:arrayListObj1)
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
             lItr.add("Panda");
         }

        while(lItr.hasPrevious())
        {
            System.out.println(lItr.previous());
        }

    }
    @Test
    public static void sortArrayList()
    {
        Collections.sort(arrayListObj1);
        System.out.println(arrayListObj1);
    }

    @Test
    public static void stringToArrayListAndGettingFreq()
    {

        java.lang.String str = "Geeks";
        java.lang.String[] strSplit = str.split("");
        List<java.lang.String> al= Arrays.asList(strSplit);
        System.out.println(Collections.frequency(al,"e"));


    }
}
