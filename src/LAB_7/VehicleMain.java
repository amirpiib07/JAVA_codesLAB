package LAB_7;
// Base class Vehicle
class Vehicle {
    protected String brand;
    protected int    year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year  = year;
    }

    public void maxSpeed() {
        System.out.println("Vehicle max speed not defined.");
    }

    public void display() {
        System.out.println("Brand: " + brand + " | Year: " + year);
    }
}

// Car subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);   // super keyword used
        this.numDoors = numDoors;
    }

    public void maxSpeed() {
        System.out.println(brand + " Car max speed: 200 km/h");
    }

    public void display() {
        super.display();
        System.out.println("Doors: " + numDoors);
    }
}

// Bicycle subclass
class Bicycle extends Vehicle {
    private String type;

    public Bicycle(String brand, int year, String type) {
        super(brand, year);   // super keyword used
        this.type = type;
    }

    public void maxSpeed() {
        System.out.println(brand + " Bicycle max speed: 30 km/h");
    }

    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}

// Scooter subclass
class Scooter extends Vehicle {
    private int engineCC;

    public Scooter(String brand, int year, int engineCC) {
        super(brand, year);   // super keyword used
        this.engineCC = engineCC;
    }

    public void maxSpeed() {
        System.out.println(brand + " Scooter max speed: 90 km/h");
    }

    public void display() {
        super.display();
        System.out.println("Engine: " + engineCC + "cc");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota",     2022, 4),
                new Bicycle("Hero",   2023, "Mountain"),
                new Scooter("Honda",  2021, 125)
        };

        for (Vehicle v : vehicles) {
            v.display();
            v.maxSpeed();
            System.out.println();
        }
    }
}
