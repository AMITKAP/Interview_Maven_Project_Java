import org.testng.annotations.Test;
public class ChildClass extends SuperAndThisKeyword
{
    String str ="I'm instance variable from child class";
    ChildClass()
    {
        super("print");

    }
    @Test
    public void createInstance()
    {
          ChildClass obj= new ChildClass();
          System.out.println(super.str);
          System.out.println(this.str);
    }
}
