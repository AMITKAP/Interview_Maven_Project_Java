package JavaLanguage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;

public class Array
{

      private static int[] array2;
      private static int[] array3;

      Array()
      {

           int[] array= {1,2,3};
           array2=new int[3];
           array3=new int[]{1,22,33,0};
      }

      @Test
      public static void arrayToList()
      {
           System.out.println(Arrays.asList(array2));

      }

      @Test
      public static void binarySearch()
      {
             System.out.println(Arrays.binarySearch(array3,22));
      }

    @Test
    public static void arraySortAndThenToString()
    {

        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

    }

    @Test
    public static void arraysComparison()
    {

       System.out.println(Arrays.equals(array3,array2));
    }

    @Test
    public static void arraysCopy()
    {
        int[] newArray;
        newArray= Arrays.copyOf(array3,4);
        System.out.println(Arrays.toString(newArray));

        newArray= Arrays.copyOfRange(array3,3,4);
        System.out.println(Arrays.toString(newArray));

    }

    @Test
    public static void arraysFills()
    {

        int array[] = new int[4];

        Arrays.fill(array,3);
        System.out.println(Arrays.toString(array));

    }
}
