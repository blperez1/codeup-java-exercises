package shapes;

public class Square extends Rectangle {
    private double side;
    
    // Square constructor
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
}
