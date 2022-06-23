import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    /**
     * Split a list into sublist (The List interface)
     */
    /*
Implement a method for splitting (partitioning) a generic list into sublist. The
method takes two arguments: a generic list and a size of sublist. The specified size of
sublist can be greater than the size of the given list.
Each sublist except the last one must have the specified size. The last sublist can
have a smaller number of elements.
     */

    /**
     * It splits the passed list into a sequence of
     * sublists with a predefined size
     */
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();

        for (int i = 0; i < list.size(); ) {
            if (i + subListSize < list.size()) {
                sublists.add(list.subList(i, i + subListSize));
            } else {
                sublists.add(list.subList(i, list.size()));
            }
            i += subListSize;
        }
        return sublists;
    }
}

