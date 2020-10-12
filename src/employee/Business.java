package employee;

public class Business {
    public static void main(String[] args) {
        Employee[] employees = {
            new Developer("Blossom"),
            new Manager("Jarrod", "Development"),
            new Developer("Isabel")
        };
        
        for(Employee e: employees) {
            e.sayHello();
            e.doWork();
        }
    }
}
