package LAB_6;
import java.util.Scanner;

public class TheaterProfit {

    // Method to calculate total profit
    static double calculateTotalProfit(int attendees) {
        double income = attendees * 5.00;                      // $5 per ticket
        double cost   = 20.00 + (attendees * 0.50);           // $20 + $0.50 per attendee
        return income - cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();

        double income = attendees * 5.00;
        double cost   = 20.00 + (attendees * 0.50);
        double profit = calculateTotalProfit(attendees);

        System.out.println("\n--- Theater Report ---");
        System.out.println("Attendees     : " + attendees);
        System.out.printf ("Total Income  : $%.2f%n", income);
        System.out.printf ("Total Cost    : $%.2f%n", cost);
        System.out.printf ("Total Profit  : $%.2f%n", profit);

        sc.close();
    }
}