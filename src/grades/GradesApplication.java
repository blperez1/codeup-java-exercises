package grades;
import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Student isaiah = new Student("Isaiah");
        Student isabel = new Student("Isabel");
        Student marcelene = new Student("Marcelene");
        Student bryan = new Student("Bryan");

        isaiah.addGrade(90);
        isaiah.addGrade(95);
        isaiah.addGrade(80);
       

        isabel.addGrade(78);
        isabel.addGrade(82);
        isabel.addGrade(76);

        marcelene.addGrade(99);
        marcelene.addGrade(99);
        marcelene.addGrade(60);

        bryan.addGrade(70);
        bryan.addGrade(80);
        bryan.addGrade(100);

        HashMap<Student, String> Students = new HashMap<>();

        Students.put(isaiah, "collgate123");
        Students.put(isabel, "peachesUnicorn");
        Students.put(marcelene, "mjDesigns");
        Students.put(bryan, "Anthony23");

        System.out.println("Welcome");
        System.out.println("Here are the GitHub usernames of our students");

        for(String values: Students.values()){
            System.out.printf("|%s| ", values);
        } 
        do {
        System.out.println("\nWhat student do you want to see more information on?");
        String userName = input.getString();

        if(Students.containsValue(userName)) { 
            String s = Students.get(userName);
            System.out.printf("Name: %s, Github username: %s\nAverage: %d\n",s.getName(), userName, s.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", input);
        }
    
        }while(input.yesNo("Would you like to see another student? [y/n]"));

        System.out.println("Goodbye, and have a wonderful day!");

        
        
    }
}

