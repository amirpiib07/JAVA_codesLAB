package LAB_6;
// Parent class
class Animal {
    String name;
    String sound;

    Animal(String name, String sound) {
        this.name  = name;    // 'this' -- refers to current class instance variable
        this.sound = sound;
    }

    void speak() {
        System.out.println(name + " says " + sound);
    }
}

// Child class demonstrating 'super'
class Dog extends Animal {
    String breed;

    // Constructor chaining using 'super' to call parent constructor
    Dog(String name, String breed) {
        super(name, "Woof");  // calling Animal's constructor using super
        this.breed = breed;   // 'this' -- refers to Dog's own field
    }

    // Demonstrating super to call parent method
    void display() {
        super.speak();  // calling Animal's speak() using super
        System.out.println("Breed: " + breed);
    }
}

// Demonstrating constructor chaining using 'this()'
class Rectangle {
    int length, width;

    // Default constructor -- calls parameterized using this()
    Rectangle() {
        this(1, 1);   // calls Rectangle(int, int)
        System.out.println("Default Rectangle created.");
    }

    // Parameterized constructor
    Rectangle(int length, int width) {
        this.length = length;
        this.width  = width;
        System.out.println("Rectangle created: " + length + " x " + width);
    }

    int area() { return length * width; }
}

public class SuperThisDemo {
    public static void main(String[] args) {
        System.out.println("--- super keyword demo ---");
        Dog dog = new Dog("Rex", "German Shepherd");
        dog.display();

        System.out.println("\n--- this() constructor chaining demo ---");
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle();        // uses this(1,1)

        System.out.println("Area of r1: " + r1.area());
        System.out.println("Area of r2: " + r2.area());
    }
}