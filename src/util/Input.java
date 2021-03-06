package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Would you like to continue? [y/n]");
        String input = this.scanner.nextLine();
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = this.scanner.nextLine();
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min,int max){
        while (true) {
            System.out.printf("Please enter an integer between %d and %d", min, max);
            int num;
            try {
                String input = scanner.nextLine();
                num = Integer.parseInt(input);
           
            } catch(Exception e) {
                System.out.println("You must enter an inter.");
                return getInt(min, max);
            }
            if (num >= min && num <= max) {
                return num;
            }
        }
    }

    public int getInt(){
        System.out.println("Choose a number");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        return num;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        int num;
        try {
            num =Integer.parseInt(input);;
        }catch(NumberFormatException nfex) {
            System.out.println("You must enter an inter.");
            return getInt(prompt);
        }

        return num;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }
    public double getDouble(double min,double max){
        while (true) {
            System.out.printf("Please enter a number between %f and %f", min, max);

            String input = scanner.nextLine();
            double num = Double.parseDouble(input);
            if (num >= min && num <= max)
                return num;
        }
    }

    public double getDouble(){
        System.out.println("Please enter a number");
        String input = scanner.nextLine();
        return Double.parseDouble(input);
    }
}