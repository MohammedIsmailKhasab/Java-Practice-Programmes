package AbtractDemo;

abstract class Shape
{
    public Shape()
    {
        System.out.println("Shape Constructor");
    }

    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape
{
    double radius;

    @Override
    public double perimeter()
    {
        return Math.PI * radius * 2;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length;
    double breadth;

    @Override
    public double perimeter()
    {
        return 2*(length  + breadth);
    }

    @Override
    public double area()
    {
        return length * breadth;
    }
}

public class AbstractExample4
{
    public static void main(String[] args)
    {
          Rectangle rec=new Rectangle();
          rec.length=10;
          rec.breadth=20;

        System.out.println(rec.perimeter());
    }
}