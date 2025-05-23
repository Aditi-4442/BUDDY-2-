java
Copy code
public class Student extends Person {
    private String studentId;
    private Buddy buddy;

    public Student(String name, String email, String studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    public void assignBuddy(Buddy buddy) {
        this.buddy = buddy;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        if (buddy != null) {
            System.out.println("Assigned Buddy: ");
            buddy.displayInfo();
        } else {
            System.out.println("No buddy assigned.");
        }
    }
}
