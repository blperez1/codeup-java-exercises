public class DishTest {
    public static void main(String[] args) {
        Dish d = new Dish();

        d.costInCents = 1200;
        d.nameOfDish = "Fish and Chips";
        d.wouldRecommend = true;

        d.printSummary();
        DishTools.analyzeDishCost(d);
        DishTools.souhtDishName(d);
        DishTools.flipRecommendation(d);
    }
}
