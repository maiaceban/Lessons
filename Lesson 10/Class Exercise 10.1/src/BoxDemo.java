public class BoxDemo {
    public static void main(String args[]) {
        // declare, allocate, and initialize Box objects
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        // get volume of first box
        vol = mybox1.getVolume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.getVolume();
        System.out.println("Volume is " + vol);
    }
}

