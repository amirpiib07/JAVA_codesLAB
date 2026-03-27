package LAB_7;
// Base class that ALL project classes MUST inherit from.
// This guarantees every class responds to the same debugging commands.
// Programmers cannot create interfaces -- they must extend this base class.
abstract class ProjectBase {

    // Common debugging methods guaranteed in every class
    public void debugInfo() {
        System.out.println("[DEBUG] Class: " + this.getClass().getName());
    }

    public void debugState() {
        System.out.println("[DEBUG] State: " + this.toString());
    }

    public abstract void displayInfo();   // every class must implement this
}

// All project classes inherit from ProjectBase
class UserModule extends ProjectBase {
    private String username;

    public UserModule(String username) {
        this.username = username;
    }

    public void displayInfo() {
        System.out.println("UserModule | User: " + username);
    }

    public String toString() {
        return "UserModule{username='" + username + "'}";
    }
}

class PaymentModule extends ProjectBase {
    private double amount;

    public PaymentModule(double amount) {
        this.amount = amount;
    }

    public void displayInfo() {
        System.out.printf("PaymentModule | Amount: $%.2f%n", amount);
    }

    public String toString() {
        return "PaymentModule{amount=" + amount + "}";
    }
}

class ReportModule extends ProjectBase {
    private String reportType;

    public ReportModule(String reportType) {
        this.reportType = reportType;
    }

    public void displayInfo() {
        System.out.println("ReportModule | Type: " + reportType);
    }

    public String toString() {
        return "ReportModule{reportType='" + reportType + "'}";
    }
}

public class ProjectDemo {
    public static void main(String[] args) {
        ProjectBase[] modules = {
                new UserModule("alice"),
                new PaymentModule(1500.00),
                new ReportModule("Monthly Sales")
        };

        for (ProjectBase module : modules) {
            module.displayInfo();
            module.debugInfo();    // same debug command works for ALL
            module.debugState();   // guaranteed because all extend ProjectBase
            System.out.println();
        }
    }
}