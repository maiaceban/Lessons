import java.util.*;
import java.util.stream.Collectors;

/**
 * Reversed list (Iterator and Iterable)
 */
/*
Implement a method that takes an instance of ListIterator and creates a new list
in the reversed order. The given iterator is on the first element of a list. Use only the
iterator to write a solution.
 */
public class Main {
    public static <T> List<T> createReversedListByIterator(ListIterator<T> iterator) {
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            iterator.next();
        }
        while (iterator.hasPrevious()) {
            list.add(iterator.previous());
        }

        return list;
    }

    /* Do not change the code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        createReversedListByIterator(list.listIterator())
                .forEach(e -> System.out.print(e + " "));
    }
}
