package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class steps
{

    @Given("i say hello to {string}")
    public void iSayHelloTo(String name)
    {
        System.out.println("hello:"+name);
    }

    @Given("i say hello to name")
    public void iSayHelloToName(DataTable data)
    {
       List<String> str=data.asList(String.class);
       System.out.println(str.get(0));
    }
}
