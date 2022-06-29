import java.util.*;

/**
 * Getting sub-maps (The Map interface)
 */
/*
Write a program that reads key-value pairs and outputs pairs whose keys belong to the specified range (inclusive)
in the ascending order by the key.
Input data format: The first line contains two values that represent range borders. The second line
contains the number of key-value pairs. Next lines contain pair (an integer key and a string value separated by a space).
Output data format:
All pairs whose keys belong to the range, each pair in a new line. The key and the value of a pair must be separated by a space.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int u = scanner.nextInt();
        int c = scanner.nextInt();

        Map<Integer, String> map = new java.util.HashMap<>();
        for (int i = 0; i < c; i++) {
            int key = scanner.nextInt();
            String value = scanner.next();
            map.put(key, value);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() >= j && entry.getKey() <= u) {
                System.out.println(entry.getKey() + " " +entry.getValue());
            }
        }
    }
}
/*
input:
2 4
5
1 aa
5 ee
2 bb
4 dd
3 cc
 */