import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

interface abc
{
    public void m();
}

public class LamdaExpression
{

    @Test
    public void test()
    {
      abc a=()->System.out.println("amit");
      a.m();
    }

    @Test
    public void customizedSortingUsingLambda()
    {
        ArrayList al =new ArrayList<Integer>();
        al.add(20);
        al.add(200);
        al.add(40);

        Collections.sort(al,(Integer a,Integer b)->(a>b)?-1:(a<b)?1:0);
        System.out.println(al.toString());

    }

}