


public class Arrays {
    public static void main(String[] args){
        double[] prices = new double[3];
        String[] names = {"Jarrod", "Blossom", "Luna"};

        Person[] persons = new Person[2];

        persons[0] = new Person("Jarrod");
        persons[1] = new Person("Luna");

        for (Person person: persons) {
            person.sayHello();
        }

        prices[0] = 1.0;
        prices[1] = 2.0;
        prices[2] = 3.0;

        for(String name: names) {
            System.out.println(name);
        }

        for(int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }





    }

}
