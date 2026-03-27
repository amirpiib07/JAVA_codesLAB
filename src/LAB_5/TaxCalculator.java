package LAB_5;
import java.util.Scanner;

public class TaxCalculator {
    private static final double TAX_RATE   = 0.15;  // 15%
    private static final double HOURLY_RATE = 12.0; // $12 per hour

    // Calculate tax on gross pay
    static double calculateTax(double grossPay) {
        return grossPay * TAX_RATE;
    }

    // Calculate net pay from number of hours worked
    static double calculateNetPay(int hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax      = calculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of hours worked: ");
        int hours = sc.nextInt();

        double grossPay = hours * HOURLY_RATE;
        double tax      = calculateTax(grossPay);
        double netPay   = calculateNetPay(hours);

        System.out.printf("%nHours Worked : %d%n",    hours);
        System.out.printf("Hourly Rate  : $%.2f%n",   HOURLY_RATE);
        System.out.printf("Gross Pay    : $%.2f%n",   grossPay);
        System.out.printf("Tax (15%%)    : $%.2f%n",   tax);
        System.out.printf("Net Pay      : $%.2f%n",   netPay);

        sc.close();
    }
}
