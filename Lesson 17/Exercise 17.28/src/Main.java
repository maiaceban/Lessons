import java.util.*;
import java.util.stream.Collectors;

/**
 * Hip-Hop (Iterator and Iterable)
 */
/*
You need to implement two methods using ListIterator.
1. The method iterateOverList should iterate over the elements from the
beginning to the end and add "Hop" after each "Hip".
2. The method printList should print all elements of the list (on a new line).
Please, use ListIterators to solve this problem.
 */
public class Main {
    public static void iterateOverList(ListIterator<String> iter) {
        while (iter.hasNext()) {
            String word = iter.next();
            if (word.equals("Hip")) {
                iter.add("Hop");
            }
        }
    }

    public static void printList(ListIterator<String> iter) {
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        iterateOverList(list.listIterator());
        printList(list.listIterator());
    }
}