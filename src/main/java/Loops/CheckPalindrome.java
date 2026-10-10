package Loops;

//Check Palindrome for number
import java.util.Scanner;

public class CheckPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n=sc.nextInt();
//
//        int m=n;
//
//        int rev=0,r;
//
//        while(n>0)
//        {
//            r=n%10;
//            rev=rev*10+r;
//            n=n/10;
//        }
//        if(rev==m)
//        {
//            System.out.println(" Palindrome number :" + rev);
//        }
//        else
//        {
//            System.out.println(" Not palindrome number :" + rev );
//        }
        System.out.println("Enter a String");
        String str=sc.nextLine();

        String rev ="";
        int i = str.length() -1;

        while(i>=0)
        {
            rev=rev+str.charAt(i);
            i--;
        }

        System.out.println("The Reverse of a String is :" +rev);

        if(str.equals(rev))
        {
            System.out.println("The String is Palindrome" );
        }
        else
        {
            System.out.println("The String is not Palindrome" );
        }
        sc.close();
    }
}