import java.util.*;

/**
 * Counting words (The Map interface)
 */
/*
Implement these two methods for a given array of string:
● wordCount that returns a SortedMap<String, Integer> where keys are all different strings and values are
the number of times that string appears in the array. The method takes an array of strings as input;
● printMap that prints all entries of the map ("key : value").
 */
public class MapUtils {
    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> map = new TreeMap<>();
        for (String word : strings) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}