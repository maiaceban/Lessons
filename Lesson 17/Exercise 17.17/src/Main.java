import java.util.*;
/**
 * Creating a map (The Map interface)
 */
/*
Create TreeMap named map and fill it with the following three key-value pairs:
where strings are keys and numbers are values.
 */
public class Main {
    public static void main(String[] args) {
        TreeMap<Object, Object> map = new TreeMap<>();
        map.put("Omega", 24);
        map.put("Alpha", 1);
        map.put("Gamma", 3);

        System.out.println(map);
    }
}