public class MovablePoint {

    public int xSpeed;
    public int ySpeed;
    int x;
    int y;

    public MovablePoint() {
        this(0, 0);
    }

    public MovablePoint(int n) {
        this(n, n);
    }

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MovablePoint(int i, int i1, int i2, int i3) {
    }

    public void display() {
        System.out.println(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "<" + x + ":" + y + ">";
    }
}