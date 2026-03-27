package LAB_7;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount ($)          : ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%) e.g. 5 for 5%%: ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter number of months              : ");
        int months = sc.nextInt();

        // Convert months to years
        double years      = months / 12.0;
        double rateDecimal = annualRate / 100.0;

        // Total interest = principal * rate * years
        double totalInterest = principal * rateDecimal * years;
        double finalBalance  = principal + totalInterest;

        System.out.println("\n--- Interest Calculation ---");
        System.out.printf("Principal        : $%.2f%n",  principal);
        System.out.printf("Annual Rate      : %.2f%%%n", annualRate);
        System.out.printf("Duration         : %d months (%.4f years)%n", months, years);
        System.out.printf("Total Interest   : $%.2f%n",  totalInterest);
        System.out.printf("Final Balance    : $%.2f%n",  finalBalance);

        sc.close();
    }
}