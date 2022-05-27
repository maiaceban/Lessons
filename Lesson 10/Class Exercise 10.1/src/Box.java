
public class Box {
    double height;
    double width;
    double lenght;

    // This is the constructor for Box.
    Box(double w, double h, double l) {
        width = w;
        height = h;
        lenght = l;
    }

    // compute and return volume
    double getVolume() {
        return width * height * lenght;
    }
}
