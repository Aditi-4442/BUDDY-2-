public class Buddy extends Person {
    private String department;

    public Buddy(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
