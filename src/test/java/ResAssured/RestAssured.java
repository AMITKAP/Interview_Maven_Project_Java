package ResAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

public class RestAssured
{

    Response res;
    RestAssured()
    {
        res= io.restassured.RestAssured.get("https://api.restful-api.dev/objects");

    }
    @Test
    public void printResponsePrettyFormat()
    {
        res.prettyPrint();

    }

    @Test
    public void getStatusCode()
    {
        System.out.println(res.getStatusCode());

    }

    @Test
    public void getStatusLine()
    {
        System.out.println(res.getStatusLine());

    }

    @Test
    public void getJsonPath()
    {
       JsonPath path= JsonPath.from(res.asString());
       System.out.println(path.getString("[0].name"));
       System.out.println(path.getInt("[0].id"));
       System.out.println(path.getList("data"));
       List<Object> l=path.getList("data");

       for(int i=0;i<l.size();i++)
       {
           System.out.println(l.get(i));
       }

    }

}
