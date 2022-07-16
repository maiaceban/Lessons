public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // override the method here

    @Override
    public double area() {
        return width * height;
    }
}
