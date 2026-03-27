package LAB_6;
import java.util.Scanner;

class Point3D {
    private int x, y, z;

    // Constructor for origin
    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // Constructor for arbitrary point
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Input coordinates
    public void inputPoint(Scanner sc) {
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
        System.out.print("Enter z: ");
        z = sc.nextInt();
    }

    // Output coordinates in (x,y,z) form
    public void outputPoint() {
        System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
    }

    // Compute distance between two 3D points
    public double distanceTo(Point3D other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        int dz = this.z - other.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class Point3DMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Point 1 ---");
        Point3D p1 = new Point3D();
        p1.inputPoint(sc);

        System.out.println("--- Enter Point 2 ---");
        Point3D p2 = new Point3D();
        p2.inputPoint(sc);

        System.out.print("Point 1: "); p1.outputPoint();
        System.out.print("Point 2: "); p2.outputPoint();

        double dist = p1.distanceTo(p2);
        System.out.printf("Distance between points: %.4f%n", dist);

        // Origin point
        Point3D origin = new Point3D();
        System.out.print("Origin : "); origin.outputPoint();
        System.out.printf("Distance from P1 to origin: %.4f%n",
                p1.distanceTo(origin));

        sc.close();
    }
}