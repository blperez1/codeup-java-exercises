public class Person {
    public static void main(String[] args) {
    //The strings are the same but the objects are not.
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    //Person 3 and 4 are seen as the same object
        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

    //
        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

    }

    private String name; 

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello %s", this.name);
    }
}
