package JavaLanguage;

import org.testng.annotations.Test;

public class Multithreading extends Thread
{
    @Override
    public void run()
    {

        System.out.println(Thread.currentThread());

    }


}
