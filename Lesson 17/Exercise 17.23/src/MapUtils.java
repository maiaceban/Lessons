import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Tricky sub-maps (The Map interface)
 */

/*
Modify and return the given map as follows:
● if the first key % 2 != 0, return sub-map from firstKey inclusive to firstKey + 4 inclusive in descending order;
● else return sub-map from lastKey – 4 inclusive to the lastKey inclusive in descending order.
 */
public class MapUtils {
    // Write your code here
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        Integer firstKey = map.firstKey();
        SortedMap<Integer, String> subMap;
        if (firstKey % 2 != 0) {
            subMap = map.subMap(firstKey, firstKey + 5);
        } else {
            Integer lastKey = map.lastKey();
            subMap = map.tailMap(lastKey - 4);
        }
        return new TreeMap<>(subMap).descendingMap();
    }
}