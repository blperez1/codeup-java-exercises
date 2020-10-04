import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Pick a number between 1 and 10");
        
        System.out.println(multiply2(3, 6));
        
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
        if(userNum < min || userNum > max) {
            System.out.println("Try again.");
            return getInteger(min, max);
        }else{
            return(userNum);
        }
    }
    
    public static long factorial(int n) {
        if(n == 0) {
            return 0;
        }
        return n * factorial(n - 1);
    }

    public static void createDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play a game.\nChoose the number of sides you want on the two dice:");
        int numberOfSides = sc.nextInt();


        int dice1 = (int)(Math.random()*numberOfSides+1);
        int dice2 = (int)(Math.random()*numberOfSides+1);

        System.out.printf("You rolled: %d %d", dice1, dice2);

    }

  
        
    
}

