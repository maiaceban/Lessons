import java.util.*;

/**
 * Removing elements (The Set interface)
 */
/*
Implement two methods.
The first method should create a set from a string of numbers separated by a space.
The second method should remove all numbers greater than 10 from the given set.
 */
public class SetUtils {
    public static Set<Integer> getSetFromString(String str) {
// write your code here
        String[] input = str.split(" ");
        SortedSet<Integer> numbers = new TreeSet<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(String.valueOf(s)));
        }
        return numbers;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
// write your code here
        set.removeIf((Integer element) -> element > 10);
    }
}
