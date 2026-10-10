package ThrowThrowsDemo;

public class ThrowThrowsDemo1
{
    static int area(int l,int b) throws Exception
    {
        if(l<0 || b<0)
            throw new Exception();
        return l*b;
    }

    static void meth1() throws Exception {
        System.out.println("Area of rectangle is " + area(-10,2));
    }

    public static void main(String[] args) throws Exception
        {
            try
            {
                meth1();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }