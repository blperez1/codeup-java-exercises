package employee;

public class Manager extends Employee {
    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public void doWork() {
        System.out.println("Meetings, meetings, meetings...");
    }
}
