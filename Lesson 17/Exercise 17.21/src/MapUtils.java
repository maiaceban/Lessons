import java.util.*;

/**
 * Modifying a map (The Map interface)
 */
/*
You need to implement the mapShare method that should modify the given map as follows:
if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c", leaving the rest of the map unmodified.
Hint: Press ctrl + d after you input the elements.
{"a":"abstraction","b":"boolean","c":"xyz"}->{"a":"abstraction","b":"abstraction"}
 */
public class MapUtils {

    public static void mapShare(Map<String, String> map) {

        String a = map.get("a");
        if (a != null) {
            map.put("b", a);
        }
        map.remove("c");
    }
}