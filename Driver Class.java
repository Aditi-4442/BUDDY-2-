import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to the Student Buddy System!");

        while (true) {
            System.out.println("\nMenu:\n1. Add Student\n2. Add Buddy to Student\n3. Display All Students\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String sName = sc.nextLine();
                    System.out.print("Enter student email: ");
                    String sEmail = sc.nextLine();
                    System.out.print("Enter student ID: ");
                    String sId = sc.nextLine();

                    students.add(new Student(sName, sEmail, sId));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student ID to assign buddy: ");
                    String searchId = sc.nextLine();
                    Student foundStudent = null;

                    for (Student s : students) {
                        if (sId.equals(searchId)) {
                            foundStudent = s;
                            break;
                        }
                    }

                    if (foundStudent != null) {
                        System.out.print("Enter buddy name: ");
                        String bName = sc.nextLine();
                        System.out.print("Enter buddy email: ");
                        String bEmail = sc.nextLine();
                        System.out.print("Enter buddy department: ");
                        String bDept = sc.nextLine();

                        Buddy newBuddy = new Buddy(bName, bEmail, bDept);
                        foundStudent.assignBuddy(newBuddy);
                        System.out.println("Buddy assigned successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    for (Student s : students) {
                        System.out.println("-------------");
                        s.displayInfo();
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        }
    }
}
