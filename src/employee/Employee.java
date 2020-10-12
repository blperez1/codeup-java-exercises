package employee;


abstract class Employee extends Person implements Worker{
    protected String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    @Override
    public void sayHello() {
        System.out.printf("Hello, my name is %s. I work in %s%n", this.getName(), this.getDepartment());
    }
}
