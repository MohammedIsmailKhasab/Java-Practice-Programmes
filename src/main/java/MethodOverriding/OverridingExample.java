package MethodOverriding;

import java.util.LinkedList;

class Car
{
    public void start()
    {
        System.out.println("Car is starting");
    }

    public void stop()
    {
        System.out.println("Car is stopping");
    }

    public void changeGear()
    {
        System.out.println("Car is changing gear");
    }
}

class LuxuryCar extends Car
{
    public void start()
    {
        System.out.println("LuxuryCar is starting");
    }

    public void stop()
    {
        System.out.println("LuxuryCar is stopping");
    }

    public void changeGear()
    {
        System.out.println("LuxuryCar is changing gear");
    }
    public void openRoof()
    {
        System.out.println("LuxuryCar is opening Roof");
    }
}

public class OverridingExample
{
    public static void main(String[] args)
    {
        LuxuryCar c = new LuxuryCar();
        c.start();
        c.stop();
        c.changeGear();
        c.openRoof();
    }
}