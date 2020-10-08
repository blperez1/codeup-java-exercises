package shapes;

public class Square extends Rectangle {
    public Square(double side) {

    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4 * side; 
    }
}
