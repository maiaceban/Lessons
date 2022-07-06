public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(MovablePoint point, int radius) {
        this.center = point;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + ", x=" + center.x + ", y=" + center.y + ", xSpeed=" + center.xSpeed + ", ySpeed=" + center.ySpeed + '}';
    }
}