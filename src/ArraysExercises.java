import java.util.Arrays;
import java.util.ArrayList;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.name = "Blossom";
        p2.name = "Jarrod";
        p3.name = "Luna";

        String[] people = {p1.name, p2.name, p3.name};
        System.out.println(Arrays.toString(people));


    }

    public static String[] addPerson(String arr[], String name) {
        List<String> arrlist = Arrays.asList(arr);

    }
}