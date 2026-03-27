package LAB_5;
import java.util.Scanner;

class Student {
    private String name;

    // Accept name and return it
    public String inputName(String name) {
        this.name = name;
        return this.name;
    }

    // Accept 3 marks, return pass/fail based on average
    public String average(double m1, double m2, double m3) {
        double avg = (m1 + m2 + m3) / 3.0;
        System.out.printf("Average marks: %.2f%n", avg);
        return (avg >= 50) ? "PASSED" : "FAILED";
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name    : ");
        String name = sc.nextLine();
        System.out.println("Name entered: " + s.inputName(name));

        System.out.print("Enter marks for exam 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks for exam 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks for exam 3: ");
        double m3 = sc.nextDouble();

        String result = s.average(m1, m2, m3);
        System.out.println("Result: The student has " + result);

        sc.close();
    }
}