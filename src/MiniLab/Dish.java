package MiniLab;

public class Dish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;

    public void printSummary() {
        System.out.printf(
            "Cost: %d%nName: %s%nRecommended: %b", 
            costInCents, 
            nameOfDish, 
            wouldRecommend);
    }
}
