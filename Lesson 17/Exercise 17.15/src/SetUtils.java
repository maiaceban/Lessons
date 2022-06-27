import java.util.*;

/**
 * Symmetric difference (The Set interface)
 */
/*
The symmetric difference of two sets is the set that contains elements that are in either of the sets
but not in their intersection. In other words, only those elements that are present in one set and not present in the other.
Check out the illustration for better understanding:
Implement a method for finding the symmetric difference of the two given sets of
strings. Elements in the resulting set can be in any order.
 */
public class SetUtils {
    /**
     * @return symmetric difference between set1 and set2
     */
    public static Set<String> symmetricDifference(Set<String> set1, Set<String> set2) {

        Set<String> result = new HashSet<>();
        for (String s : set1) {
            if (!set2.contains(s)) {
                result.add(s);
            }
        }
        for (String s : set2) {
            if (!set1.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }
}