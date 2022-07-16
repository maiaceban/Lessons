public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // override the method here

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
