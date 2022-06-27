import java.util.*;
import java.util.stream.Collectors;

/**
 * Strict superset (The Set interface)
 */

/*
In this problem, you need to implement a math operation that checks whether the
second set is a strict superset of the first set.
It means, the second set should contain all elements of the first set, but the sets
must not be equal.
 */
public class Main {
    private static <T> boolean isStrictSuperset(Set<T> set1, Set<T> set2) {

        if (set2.size() <= set1.size()) {
            return false;
        }
        return set2.containsAll(set1);
    }

    /* Please do not change the code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set1 = readStringSet(scanner);
        Set<String> set2 = readStringSet(scanner);
        System.out.println(isStrictSuperset(set1, set2));
    }

    private static Set<String> readStringSet(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toSet());

    }
}