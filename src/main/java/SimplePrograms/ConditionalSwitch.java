package SimplePrograms;

import java.util.Scanner;

public class ConditionalSwitch {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become adult");
                break;
            case 23:
                System.out.println("You are going to get a job");
                break;
            case 28:
                System.out.println("You are going to get married");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}