public class Circle implements Movable {

    private final Point point;
    private final int radius;

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
        point.setY(point.getY() + distance);
    }

    @Override
    public void moveDown(int distance) {
        point.setY(point.getY() - distance);
    }

    @Override
    public void moveLeft(int distance) {
        point.setX(point.getX() - distance);
    }

    @Override
    public void moveRight(int distance) {
        point.setX(point.getX() + distance);
    }
}