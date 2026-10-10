package Interfaces;

class Phone
        {
            public void call()
            {
                System.out.println(" Phone call...");
            }
            public  void sms()
            {
                System.out.println(" Phone sms...");
            }
        }

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

interface IScreen
{
    void showwidjets();
    void hidewidjets();
}

class Smartphone extends Phone implements ICamera, IMusicPlayer, IScreen
{

    public  void Videocall()
    {
        System.out.println(" Smartphone Videocall...");
    }

    @Override
    public void click()
    {
        System.out.println(" Smartphone clicking photo...");
    }

    @Override
    public  void record()
    {
        System.out.println(" Smartphone recording video...");
    }

    @Override
    public void play()
    {
        System.out.println(" Smartphone playing music...");
    }

    @Override
    public void stop()
    {
        System.out.println(" Smartphone stopping music...");
    }

    @Override
    public void showwidjets()
    {
        System.out.println(" Smartphone showing widjets...");
    }

    @Override
    public void hidewidjets()
    {
        System.out.println(" Smartphone hiding widjets...");
    }
}

public class InterfaceExample3
{
    public static void main(String[] args)
    {
        Smartphone sp=new Smartphone();
        sp.call();
        sp.click();
        sp.record();
        sp.play();
        sp.stop();
        sp.showwidjets();
        sp.hidewidjets();
    }
}