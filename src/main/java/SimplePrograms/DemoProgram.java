package SimplePrograms;

import java.util.Scanner;

//based on if-else
public class DemoProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte m1,m2,m3;
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Maths");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3.0f;
        if (avg >=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations! You are promoted");
        }
        else {
            System.out.println("sorry ! You are not promoted");
        }
    }
}
