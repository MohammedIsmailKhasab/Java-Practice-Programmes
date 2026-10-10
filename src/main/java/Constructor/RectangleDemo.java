package Constructor;

public class RectangleDemo
{
    private double length;
    private double breadth;

    public RectangleDemo()
    {
        length=1;
        breadth=1;
    }

    public RectangleDemo(double l,double b)
    {
        length=l;
        breadth=b;
    }

    public RectangleDemo(double s)
    {
        length=breadth=s;
    }

    public static void main(String[] args)
    {
        RectangleDemo rectangle = new RectangleDemo(-10,-12);
    }

}
