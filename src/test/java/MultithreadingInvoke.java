import org.testng.annotations.Test;

public class MultithreadingInvoke
{

    private static Multithreading mt;

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        mt= new Multithreading();
        mt.start();
        System.out.println(Thread.currentThread().getName());

    }


    @Test
    public void setAndGetThreadName()
    {
        Thread.currentThread().setName("Main Thread Test");
        Thread.currentThread().getName();
    }

    @Test
    public void setThreadPriority()
    {
         mt.setPriority(Thread.MAX_PRIORITY);
         mt.setPriority(Thread.MIN_PRIORITY);
         mt.setPriority(Thread.NORM_PRIORITY);
    }
}
