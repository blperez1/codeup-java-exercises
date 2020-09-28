public class HelloWorld {
    public static void main(String[] args){
        int myFavoriteNumber = 23;
        String myString = "Make room for the cupcake";
        float myNumber = 3.14f;

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
;       
        int z = 4;
        z += 5;
        System.out.println(z);

        int a = 3;
        a *= 4;
        System.out.println(a);

        int b = 10;
        int c = 2;
        b /= c;
        c -= b;
        System.out.println(b);
        System.out.println(c);

        System.out.println("Hello, World!");
    }
}
