import java.util.*;
/**
 * No "J" (Iterator and Iterable)
 */
/*
Implement a method that does the following algorithm:
1. creates List<String> from a given array of strings;
2. using ListIterator, removes all items not starting with "J" ;
3. removes "J" from items beginning with "J" (e.g., JFrame -> Frame);
4. prints all the remaining elements in the reverse order.
 */
public class Main {
    public static void processIterator(String[] array) {
        List<String> strings = new ArrayList<>(List.of(array));
        ListIterator<String> iterator = strings.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (!next.startsWith("J")) {
                iterator.remove();
            } else {
                iterator.set(next.substring(1));
            }
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}