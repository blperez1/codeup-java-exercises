package employee;

public class Developer extends Employee{
    public Developer(String name, String department){
        super(name, department);
    }

    public Developer(String name) {
        super(name, "Development");
    }

    @Override
    public void doWork() {
        System.out.print("Writing code, fixing bug...");;
    }
}
