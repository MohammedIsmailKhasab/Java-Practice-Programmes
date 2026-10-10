package ConditionalPrograms;

public class elseifProgram
{
    public static void main(String[] args)
    {
        int a=10,b=20,c=30;

//        if(a>b && a>c)
//        {
//            System.out.println(a);
//        }
//        else if(b>a && b>c)
//        {
//            System.out.println(b);
//        }
//        else if(c>a&&c>b)
//        {
//            System.out.println(c);
//        }
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}