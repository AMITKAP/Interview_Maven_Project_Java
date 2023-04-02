import org.testng.annotations.Test;
public class ChildClass extends SuperAndThisKeyword
{
    String str ="I'm an instance variable from child class";
    ChildClass()
    {
        super("print");

    }
    @Test
    public void createInstance()
    {
          ChildClass obj= new ChildClass();
          System.out.println(obj);
          System.out.println(super.str);
          System.out.println(this.str);
    }

    @Override
    public String toString()
    {
        return "I'm from child class tostring";
    }
}
