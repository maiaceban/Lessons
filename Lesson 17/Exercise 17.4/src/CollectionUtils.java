import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {
    /**
     * Squares list
     * (The Collections Framework)
     */
    /*
    Implement a method called pow2 that takes a collection of numbers and returns a
    collection of squares of these numbers.
    Do not modify elements of the given collection, create a new one and return it as the
    result instead.
    Sample Input 1: 10 20 -5    Sample Output 1: 100 400 25
     */
    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        Collection<Integer> squares = new ArrayList<>();
        numbers.forEach(num -> squares.add(num * num));
        return squares;
    }
}
