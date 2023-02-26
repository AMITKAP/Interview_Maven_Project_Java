import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;

public class HashMapPractice
{
    private static HashMap<String,String> map;

    @BeforeTest
    public static void createMap()
    {

        map=new HashMap<String,String>();
        map.put("FName","Amit");
        map.put("LName","Kapoor");
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
}
