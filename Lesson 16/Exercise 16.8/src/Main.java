import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();
        for (int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }

    public static Supplier<Integer> getInfiniteRange() {
        AtomicInteger i = new AtomicInteger();
        return i::getAndIncrement;
    }
}
