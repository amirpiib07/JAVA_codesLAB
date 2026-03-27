package LAB_5;
// Product class
class Product {
    protected int    productId;
    protected String name;
    protected int    categoryId;
    protected double unitPrice;

    public Product(int productId, String name, int categoryId, double unitPrice) {
        this.productId  = productId;
        this.name       = name;
        this.categoryId = categoryId;
        this.unitPrice  = unitPrice;
    }

    public void displayProduct() {
        System.out.println("Product ID  : " + productId);
        System.out.println("Name        : " + name);
        System.out.println("Category ID : " + categoryId);
        System.out.printf ("Unit Price  : $%.2f%n", unitPrice);
    }
}

// ElectricalProduct extends Product
class ElectricalProduct extends Product {
    private String voltageRange;
    private double wattage;

    public ElectricalProduct(int productId, String name, int categoryId,
                             double unitPrice, String voltageRange, double wattage) {
        super(productId, name, categoryId, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage      = wattage;
    }

    // Behavior to change wattage and price
    public void changeWattage(double newWattage) {
        this.wattage = newWattage;
        System.out.println("Wattage updated to: " + newWattage + "W");
    }

    public void changePrice(double newPrice) {
        this.unitPrice = newPrice;
        System.out.printf("Price updated to: $%.2f%n", newPrice);
    }

    public void displayProduct() {
        super.displayProduct();
        System.out.println("Voltage Range: " + voltageRange);
        System.out.printf ("Wattage      : %.1fW%n", wattage);
    }
}

// Main class
public class ProductMain {
    public static void main(String[] args) {
        ElectricalProduct ep = new ElectricalProduct(
                101, "LED Bulb", 5, 12.99, "110-240V", 9.0
        );

        System.out.println("--- Before Update ---");
        ep.displayProduct();

        ep.changeWattage(12.0);
        ep.changePrice(14.99);

        System.out.println("\n--- After Update ---");
        ep.displayProduct();
    }
}