package annotationsdemo;

//User Defined Annotation
@interface MyAnno
{
    String name();
    String project();
    String date();
    String version();
}

@MyAnno(name = "Mallu",project = "Bank",date = "12-2-2027",version = "1.8")
public class AnnoDemo3
{
    int data;
    static void main(String[] args)
    {
        int x;
    }
}
