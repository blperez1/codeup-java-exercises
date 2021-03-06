import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.print(add(3, 2));
        System.out.print(subtract(3, 2));
        System.out.print(multiply(3, 2));
        System.out.print(divide(3, 2));
        System.out.print(remainder(3, 2));
        System.out.print(product(3, 2));
        
    }
    
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }
    
    public static int product(int num1, int num2) {
        if(num1 == 0 || num2 == 0){
            return 0;
        }
        return num1 + product(num1, num2 -1);
    }
    
    public static int multiply2(int num2, int num1) {
        int product = 0;
        for(int i = 1; i <= num1; i++) {
            product += num2;
        }
        return product;
    }

    public static void powersTable() {
        System.out.println("What number would you like to go to?");
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();

        System.out.println("Here is your table!");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for(int i = 1; i <= userNum; i++) {
            System.out.printf("%-6d | %-7d | %d%n", i, i * i, i * i * i);
        }
        System.out.println();
        System.out.println("Would you like to continue? (y/n)");
        String answer = sc.next();
        if(answer.equalsIgnoreCase("y")) {
            powersTable();
        }     

    }

    public static void getLetterGrades() {
            Scanner sc = new Scanner(System.in);
            System.out.println("What was your grade on the last test:");
            int grade = sc.nextInt();

            System.out.println(getNumberGrade(grade));

            System.out.println("Would you like to continue? (y/n)");
            String answer = sc.next();

            if(answer.equalsIgnoreCase("y")) {
                getLetterGrades();
            }
    }
    
    public static String getNumberGrade(int grade) {
        if(grade <= 100 && grade >= 88) {
            return "Your letter grade is A";
        }else if(grade >= 80) {
            return "Your letter grade is B";
        }else if(grade >= 67) {
            return "Your letter grade is C";
        }else if(grade >= 60) {
            return "Your letter grade is D";
        } else {
            return "Your letter grade is F";
        }
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Enter an number between %d and %d: ", min, max);
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if(userNum < min ) {
            System.out.printf("This uber is lower than %d", min);
            return getInteger(min, max);
        }else if(userNum > max){
            System.out.printf("This number is higher than %d", max);
            return getInteger(min, max);
        }
            return userNum;
        
    }
    
    public static long factorial(int n) {
        if(n == 0) {
            return 0;
        }
        return n * factorial(n - 1);
    }

    public static long factorial2() {
        int userInput = getInteger(1, 10);
        int count = 1;
        for(int i = 1; i <= userInput; i++) {
            count *= i;
        }
        return count; 
    }

    public static void randomize(short sides){
        System.out.println( (int) Math.floor(Math.random() * sides) );
        System.out.println( (int) Math.floor(Math.random() * sides) );
    }

    public static void rollDice(Scanner scan){
        int counter = 0;

        while(true){
            counter++;
            System.out.println("Roll Dice method");
            System.out.println("Number of sides: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue? y/n");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Ok, bye, you played " + counter + " times");
                break;
            }
        }

  
    }       
    
}

