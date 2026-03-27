package LAB_7;
// Teacher class
class Teacher {
    protected String name;
    protected String subject;
    protected int    experience;  // years

    public Teacher(String name, String subject, int experience) {
        this.name       = name;
        this.subject    = subject;
        this.experience = experience;
    }

    public void displayTeacher() {
        System.out.println("Name       : " + name);
        System.out.println("Subject    : " + subject);
        System.out.println("Experience : " + experience + " years");
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}

// Student extends Teacher -- reuses Teacher code, adds only new members
class Student extends Teacher {
    private int    rollNo;
    private double marks;

    public Student(String name, String subject, int experience,
                   int rollNo, double marks) {
        super(name, subject, experience);  // reusing Teacher's constructor
        this.rollNo = rollNo;
        this.marks  = marks;
    }

    // Only additional members not in Teacher
    public void displayStudent() {
        super.displayTeacher();             // reusing Teacher's display
        System.out.println("Roll No    : " + rollNo);
        System.out.printf ("Marks      : %.1f%n", marks);
    }

    public void study() {
        System.out.println(name + " is studying " + subject);
    }
}

public class TeacherStudentDemo {
    public static void main(String[] args) {
        System.out.println("--- Teacher ---");
        Teacher t = new Teacher("Mr. Sharma", "Mathematics", 15);
        t.displayTeacher();
        t.teach();

        System.out.println("\n--- Student (extends Teacher) ---");
        Student s = new Student("Amit Patel", "Physics", 0, 101, 88.5);
        s.displayStudent();
        s.study();
    }
}