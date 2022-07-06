public class Triangle extends Polygon {
    public MovablePoint cornerOne;
    public MovablePoint cornerTwo;
    public MovablePoint cornerThree;

    public Triangle(MovablePoint cornerOne, MovablePoint cornerTwo, MovablePoint cornerThree) {
        this.cornerOne = cornerOne;
        this.cornerTwo = cornerTwo;
        this.cornerThree = cornerThree;
    }
    @Override
    public String toString() {
        return "<" + cornerOne + ":" + cornerTwo + ":" + cornerThree + ">";
    }
}