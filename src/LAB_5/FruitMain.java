package LAB_5;
// Fruit class
class Fruit {
    private String  name;
    private String  type;    // "Single" or "Bunch"
    private double  price;

    public Fruit(String name, String type, double price) {
        this.name  = name;
        this.type  = type;
        this.price = price;
    }

    public void displayFruit() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Type       : " + type);
        System.out.printf ("Price      : $%.2f%n", price);
    }
}

public class FruitMain {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Mango",  "Single", 1.50);
        Fruit f2 = new Fruit("Grapes", "Bunch",  3.75);

        System.out.println("--- Fruit 1 ---");
        f1.displayFruit();

        System.out.println("\n--- Fruit 2 ---");
        f2.displayFruit();
    }
}