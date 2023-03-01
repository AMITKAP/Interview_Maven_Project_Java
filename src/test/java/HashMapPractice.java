import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapPractice
{
    private static HashMap<String,String> map;
    private static int numberOfDigits;
    private static int reminder=0;
    private static int quotient=0;
    private static double reverseNumber=0;


    @BeforeTest
    public static void createMapForTest()
    {

        map=new HashMap<String,String>();
        map.put("LName","Sum");
        map.put("FName","Amit");
        numberOfDigits=String.valueOf(121).length();
        quotient=121;
    }

    @AfterTest
    public static void clearMapForTest()
    {

        map.clear();

    }

    @Test
    public static void getMapElementBasedOnKey()
    {
        System.out.println(map.get("FName"));
        System.out.println(map.get("LName"));

    }

    @Test
    public static void validateKeyValueInMap()
    {
        System.out.println(map.containsKey("FName"));
        System.out.println(map.containsValue("Kapoor"));

    }

    @Test
    public static void getSizeOfMap()
    {
        System.out.println(map.size());

    }

    @Test
    public static void removeAKeyFromMap()
    {
        System.out.println(map.remove("FName"));
        System.out.println(map.size());
    }

    @Test
    public static void replaceAValueFromMap()
    {
         map.replace("FName","Ram");
         System.out.println(map.get("FName"));
    }

    @Test
    public static void iterateValuesInMap()
    {
         for(String val:map.values())
         {
             System.out.println(val);
         }

    }
    @Test
    public static void iterateKeysInMap()
    {
        for(String key:map.keySet())
        {
            System.out.println(key);
        }

    }
    @Test
    public static void iterateKeysInMapUsingLambdaExp()
    {

        map.forEach((key,value)->
        {
            System.out.println(key);
            System.out.println(value);
        });

    }
    @Test
    public static void sortedMap()
    {

        System.out.println(new TreeMap<>(map));

    }
    @Test
    public static void synchronizedHashMap()
    {

        Collections.synchronizedMap(map);

    }

}
