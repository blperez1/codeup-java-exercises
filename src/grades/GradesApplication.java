package grades;
import java.util.HashMap;

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

        HashMap<String, String> usernames = new HashMap<>();

    }
}
