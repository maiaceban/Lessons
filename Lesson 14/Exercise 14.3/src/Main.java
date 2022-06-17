public class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle(1.56, 45.88);
        Shape t = new Triangle(15.61, 36.63, 24);
        Shape c = new Circle(3.999);

        Shape[] arr = {r, t, c};

        for (Shape shape : arr) {
            System.out.println((shape.getClass() + "area is: " + shape.getArea()));
            System.out.println(shape.getClass() + "perimeter is: " + shape.getPerimeter());
        }
    }
}
