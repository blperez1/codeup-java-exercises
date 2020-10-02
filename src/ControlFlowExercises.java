import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("What was your grade on the last test:");
            int grade = scanner.nextInt();

            if(grade <= 100 && grade >= 88) {
                System.out.println("Your letter grade is A");
            }else if(grade >= 80) {
                System.out.println("Your letter grade is B");
            }else if(grade >= 67) {
                System.out.println("Your letter grade is C");
            }else if(grade >= 60) {
                System.out.println("Your letter grade is D");
            } else {
                System.out.println("Your letter grade is F");
            }
            System.out.println();
            System.out.println("Would you like to continue? (y/n)");
            answer = scanner.next();
        }while(answer.equalsIgnoreCase("y"));

        do {
            System.out.println("Enter a random number:");
            int userNumber = scanner.nextInt();
            System.out.println("Here is your table!");

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userNumber; i += 1) {
                System.out.printf("%-6d | %-7d | %d%n", i, i * i, i * i * i);
            }

            System.out.println();
            System.out.println("Would you like to continue? (y/n)");
            answer = scanner.next();
        }while(answer.equalsIgnoreCase("y"));

        int w = 5;
        while(w <= 15) {
            System.out.println(w);
            w++;
        }
        
        for(int i = 5; i <= 15; i++) {
            System.out.printf("%d ", i);
        } 

        int y = 2;
        do{
            System.out.println(y);
            y += 2;
        }while(y <= 100);

        for(int i = 0; i <= 100; i+=2) {
            System.out.printf("%d%n", i);
        }

        int z = 100;
        do{
            System.out.println(z);
            z -= 5;
        }while(z >= 5);

        for(int i = 100; i >= 5; i-=5) {
            System.out.printf("%s%n", i);
        }

        int n = 2;
        do{
            System.out.println(n);
            n = (int)Math.pow(n, 2);

        }while(n <=100000);

        for(int i = 1; i <= 100; i++) {
            if(i % 15 == 0) {
                System.out.println("fizzbuzz");
            }else if(i % 5 == 0) {
                System.out.println("buzz");
            }else if(i % 3 == 0) {
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
        
    }
}