package Constructor;

//how to use this keyword
public class Rectangle
{
    int length;
    int breadth;

    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    void  display()
    {
        System.out.println("The length is: "+this.length);
        System.out.println("The breadth is: "+this.breadth);
    }
}

class ThisSuper
{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(20,10);
        r1.display();
    }
}
