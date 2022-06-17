public class Rectangle extends Shape {
    private double height;
    private double lenght;

    public Rectangle(double height, double lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    @Override
    double getPerimeter() {
        return (height + lenght) * 2;
    }

    @Override
    double getArea() {
        return height * height;
    }
}
