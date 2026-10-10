package AbtractDemo;

abstract class Hospital
{
    abstract void MyHospital();
    abstract void emergency();
    abstract void OPD();
    abstract void billing();
    abstract void Reception();
}

class MyHospital extends Hospital
{
    public void MyHospital()
    {
        System.out.println("MyHospital Near Vidhana Soudha Yadgir");
    }

    public void emergency()
    {
        System.out.println("emergency section");
    }

    public void OPD()
    {
        System.out.println("OPD");
    }

    public void billing()
    {
        System.out.println("billing section");
    }

    public void Reception()
    {
        System.out.println("Reception section");
    }
}

public class AbstractExample2
{
    public static void main(String[] args)
    {
        Hospital hsptl = new MyHospital();
        hsptl.MyHospital();
        hsptl.emergency();
        hsptl.OPD();
        hsptl.billing();
        hsptl.Reception();
    }
}