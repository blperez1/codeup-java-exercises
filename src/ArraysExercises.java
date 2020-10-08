import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Jarrod");
        people[1] = new Person("Blossom");
        people[2] = new Person("Luna");

        //Out of bounds. Cannot add new element that exceeds the initial length.
        // people[3] = new Person("Ellie");

        for(Person person: people){
            System.out.println(person.getName());
        }


    }

    public static Person[] addPerson(Person[] arr, Person personToAdd) {
        Person[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = personToAdd;
        return newArray;
    }

}