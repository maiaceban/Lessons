public class Circle implements Movable, Scalable{
    private final Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void moveUp(int distance) {
        point.moveUp(distance);
    }

    @Override
    public void moveDown(int distance) {
        point.moveDown(distance);
    }

    @Override
    public void moveLeft(int distance) {
        point.moveLeft(distance);
    }

    @Override
    public void moveRight(int distance) {
        point.moveRight(distance);
    }

    @Override
    public void scale(int scale) {
        radius *= scale;
    }
}