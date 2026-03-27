package LAB_6;
// Abstract class Car
abstract class Car {
    protected String model;  // instance variable

    public Car(String model) {
        this.model = model;
    }

    // Concrete method
    public void displayModel() {
        System.out.println("Car Model: " + model);
    }

    // Abstract methods
    public abstract void avg();
    public abstract void mode();
}

// Maruti subclass
class Maruti extends Car {
    public Maruti() {
        super("Maruti Suzuki");
    }

    public void avg() {
        System.out.println(model + " average mileage: 22 km/l");
    }

    public void mode() {
        System.out.println(model + " drive mode   : Eco/Sport");
    }
}

// Santro subclass
class Santro extends Car {
    public Santro() {
        super("Hyundai Santro");
    }

    public void avg() {
        System.out.println(model + " average mileage: 20 km/l");
    }

    public void mode() {
        System.out.println(model + " drive mode   : City/Highway");
    }
}

// Car1 -- uses abstract reference to refer to subclass objects
public class Car1 {
    public static void main(String[] args) {
        // Abstract class reference pointing to Maruti object
        Car car = new Maruti();
        car.displayModel();
        car.avg();
        car.mode();

        System.out.println();

        // Same reference now pointing to Santro object
        car = new Santro();
        car.displayModel();
        car.avg();
        car.mode();
    }
}