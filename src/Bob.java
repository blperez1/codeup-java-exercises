import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String answer;
       do {
            System.out.println("Say anything to Bob:");
            String convo = sc.nextLine();
            if(convo.endsWith("?")) {
                System.out.println("Sure.");
            }else if(convo.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            }else if(convo.equals("")) {
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("Whatever.");
            }
            System.out.println("Would you like to continue your conversation? [y/n]");
            answer = sc.next();
        }while(answer.equals("y"));
    }  
}
