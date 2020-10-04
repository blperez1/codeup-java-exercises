import java.util.Random;
import java.util.Scanner;

public class Highlow {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Lets play a game!");
        System.out.println("I'm think of a number between 1 and 100. Guess What number that is.");
        int userNum = sc.nextInt();

        if(userNum > rand) {
            System.out.println("Lower");
        }else if (userNum < rand) {
            System.out.println("Higher");
        }else if(userNum == rand) {
            System.out.println("Great Guess!");
        }
    }


}
