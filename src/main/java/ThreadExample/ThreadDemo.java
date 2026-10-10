package ThreadExample;

//class MyThread extends Thread
//{
//    @Override
//    public void run()
//    {
//        System.out.println("Thread is running");
//    }
//}

class MyRunnable implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Thread is running");
    }
}


public class ThreadDemo
{
    public static void main(String[] args)
    {
        MyRunnable Thread = new MyRunnable();
        Thread.run();
    }
}