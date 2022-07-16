public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    // override the method here

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
