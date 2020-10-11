package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
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
        Scanner sc = new Scanner(System.in);

        Students.put(isaiah, "collgate123");
        Students.put(isabel, "peachesUnicorn");
        Students.put(marcelene, "mjDesigns");
        Students.put(bryan, "Anthony23");

        System.out.println("Welcome");
        System.out.println("Here are the GitHub usernames of our students");
        System.out.printf("|%s| |%s| |%s| |%s|", 
                        Students.get(isabel), 
                        Students.get(isaiah), 
                        Students.get(marcelene),
                        Students.get(bryan));
        System.out.println("What student do you want to see more information on?");
        String input = sc.next();

        if(!Students.containsValue(input)) {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".", input);
            System.out.println("Would you like to see another student?");
        }
        }

        
        
    }

