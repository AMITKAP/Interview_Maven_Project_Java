import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapPractice
{
    private static HashMap<String,String> map;

    @BeforeTest
    public static void createMapForTest()
    {
        map=new HashMap<String,String>();
        map.put("LName","Sum");
        map.put("FName","Amit");
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
    public static void iterateKeySetInMap()
    {
        for(Map.Entry<String,String> ent :map.entrySet())
        {
            System.out.println(ent.getKey());
            System.out.println(ent.getValue());
        }
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
         System.out.println(map.replace("FName","Ram"));
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
