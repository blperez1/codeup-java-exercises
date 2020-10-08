import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {
            "deadpan",
            "fearful",
            "abusive",
            "accurate",
            "rural",
            "slippery",
            "ruthless",
            "well-off",
            "rebel",
            "threatening"
        };
        String[] nouns = {
            "talk",
            "pets",
            "wire",
            "wall",
            "end",
            "plate",
            "dust",
            "apparatus",
            "bath",
            "hour"
        };
        
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s%n", getRandomElement(adjectives), getRandomElement(nouns));
    }
    
    public static String getRandomElement(String[] array) {
        Random rnd = new Random();
        return array[rnd.nextInt(array.length)];
    }
}
