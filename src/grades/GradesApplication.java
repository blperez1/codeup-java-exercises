package grades;
import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();
        Student isaiah = new Student("Isaiah");
        Student isabel = new Student("Isabel");
        Student marcelene = new Student("Marcelene");
        Student bryan = new Student("Bryan");
        students.put("collgate123", isaiah);
        students.put("peachesUnicorn", isabel);
        students.put("mjDesigns", marcelene);
        students.put("Anthony23", bryan);

    
        bryan.addGrade(78);
        bryan.addGrade(90);
        bryan.addGrade(86);
        bryan.addGrade(78);

        isabel.addGrade(89);
        isabel.addGrade(97);
        isabel.addGrade(86);
        isabel.addGrade(78);

        isaiah.addGrade(96);
        isaiah.addGrade(94);
        isaiah.addGrade(86);
        isaiah.addGrade(84);

        marcelene.addGrade(83);
        marcelene.addGrade(94);
        marcelene.addGrade(74);
        marcelene.addGrade(84);
  

        System.out.println("Welcome");
        System.out.println("Here are the GitHub usernames of our students");

        for(String key: students.keySet()){
            System.out.printf("|%s| ", key);
        } 


        boolean confirm;
        do {

        System.out.print("\nWhich student would you like more information on?");
        String userName = input.getString();
            if(students.containsKey(userName)) { 
                Student selectedStudent = students.get(userName);
                System.out.printf("Name: %s, Github username: %s%nAverage: %.2f%n", selectedStudent.getName(), userName, selectedStudent.getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", input);
            }
            confirm = input.yesNo("Would you like to see another student? [y/n]");
        }while(confirm);

        System.out.println("Goodbye, and have a wonderful day!");

        
        
    }

}

