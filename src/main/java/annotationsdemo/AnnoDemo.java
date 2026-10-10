package annotationsdemo;

//Demo On Built-In annotation
class OldClass
{
    public void display()
    {
        System.out.println("Hello World");
    }

    @Deprecated
    public void show()
    {
        System.out.println("Hi");
    }
}
public class AnnoDemo
{
    @SuppressWarnings("deprecation")
    static void main(String[] args)
    {
        OldClass obj = new OldClass();
        obj.show();

    }
}