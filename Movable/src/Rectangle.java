public class Rectangle extends Polygon {
    public int width;
    public int height;
    public MovablePoint topRightCorner;

    public Rectangle(int width, int height, MovablePoint topRightCorner) {
        this.width = width;
        this.height = height;
        this.topRightCorner = topRightCorner;
    }

    @Override
    public String toString() {
        return "<" + width + ":" + height + ":" + topRightCorner + ">";
    }
}
