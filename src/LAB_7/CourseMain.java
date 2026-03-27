package LAB_7;
// Course class
class Course {
    private int    id;
    private String description;
    private int    duration;   // in weeks
    private double fees;

    // Parameterized constructor
    public Course(int id, String description, int duration, double fees) {
        this.id          = id;
        this.description = description;
        this.duration    = duration;
        this.fees        = fees;
    }

    // GetData -- displays the course data
    public void GetData() {
        System.out.println("Course ID   : " + id);
        System.out.println("Description : " + description);
        System.out.println("Duration    : " + duration + " weeks");
        System.out.printf ("Fees        : $%.2f%n", fees);
    }
}

public class CourseMain {
    public static void main(String[] args) {
        // Array of 5 Course objects
        Course[] courses = new Course[5];

        courses[0] = new Course(101, "Java Programming",   12, 9999.00);
        courses[1] = new Course(102, "Data Structures",    10, 7999.00);
        courses[2] = new Course(103, "Web Development",    16, 12999.00);
        courses[3] = new Course(104, "Database Management", 8, 5999.00);
        courses[4] = new Course(105, "Machine Learning",   20, 19999.00);

        System.out.println("========== All Courses ==========");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("\n--- Course " + (i + 1) + " ---");
            courses[i].GetData();
        }
    }
}
