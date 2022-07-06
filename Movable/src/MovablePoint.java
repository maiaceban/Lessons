public class MovablePoint {
    //    public int x;
//    public int y;
    public int xSpeed;
    public int ySpeed;
    //    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
//    {
//        this.x=x;
//        this.y=y;
//        this.xSpeed=xSpeed;
//        this.ySpeed=ySpeed;
//    }
//
//    @Override
//    public String toString() {
//        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
//    }
//
//    @Override
//    public void moveUp() {
//        y+=ySpeed;
//    }
//
//    @Override
//    public void moveDown() {
//        y-=ySpeed;
//    }
//
//    @Override
//    public void moveRight() {
//        x+=xSpeed;
//    }
//
//    @Override
//    public void moveLeft() {
//        x-=xSpeed;
//    }
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