
public class Main {
    public static void main(String[] args) {
        Box<Cake> cakeBox = new Box<>();
        cakeBox.put(new Cake());

        Cake cake = cakeBox.get();


        Box<Chocolate> chocolateBox = new Box<>();
        chocolateBox.put(new Chocolate());

        Chocolate chocolate = chocolateBox.get();
    }
}
