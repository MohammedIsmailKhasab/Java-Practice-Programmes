package MethodOverriding;

public class TV
{
    public void  switchON()
    {
        System.out.println("TV is Switched On");
    }

    public void switchOFF()
    {
        System.out.println("TV is Switched Off");
    }
}

class SmartTV extends TV
{
    @Override
    public void  switchON()
    {
        System.out.println("SmartTV is Switched On");
    }

    @Override
    public void  switchOFF()
    {
        System.out.println("SmartTV is Switched Off");
    }

    public void browse()
    {
        System.out.println("SmartTV is Browsing");
    }
}
class Overriding1
{
    public static void main(String[] args)
    {
            TV t=new SmartTV();
            t.switchON();
//
//            SmartTV s=new SmartTV();
//            s.browse();
    }
}