package ThreadExample;

//Demo On Sleep method of thread
class MyThread2 extends Thread
{
    public MyThread2(String name)
    {
        super(name);
    }

public void run()
{
    int count = 1;
    while(true)
    {
        System.out.println(count++);
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
}

public class ThreadTest2 {

    public static void main(String[] args) throws Exception {
        MyThread2 t = new MyThread2("My Thread 1");
        t.start();
    }
}