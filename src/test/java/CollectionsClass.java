import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClass
{

    @Test
    public static void countFrequency()
    {

        List<String> mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("code");
        mylist.add("quiz");

        System.out.println(Collections.frequency(mylist,"code"));
    }

    @Test
    public static void sortCollections()
    {
        List<String> mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");

        Collections.sort(mylist);
        System.out.println(mylist);
    }

    @Test
    public static void reverseCollections()
    {
        List<String> mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("amit");

        Collections.reverse(mylist);
        System.out.println(mylist);

    }

}
