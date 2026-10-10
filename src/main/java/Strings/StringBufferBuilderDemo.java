package Strings;

public class StringBufferBuilderDemo
{
    static void main(String[] args)
    {
        String s1=new String("Hello World" );

        StringBuffer s2=new StringBuffer("Hello World");

        StringBuilder s3=new StringBuilder("Hello World");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}