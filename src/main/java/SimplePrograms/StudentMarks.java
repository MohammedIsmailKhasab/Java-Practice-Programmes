package SimplePrograms;

import java.util.Scanner;

public class StudentMarks
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of 5 subjects (out of 100):");

        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();
        int subject4 = sc.nextInt();
        int subject5 = sc.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4+ subject5;

        double percentage = (totalMarks/500.0) * 100;

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
        sc.close();
    }
}