package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String aName) {
        this.name = aName;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return grades; 
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        double sum = grades.stream().mapToDouble(n -> n).sum();
        return sum / grades.size();
    }
        
}