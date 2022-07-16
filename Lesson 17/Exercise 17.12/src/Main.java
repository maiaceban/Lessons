import java.util.*;

/**
 * Output elements (The Set interface)
 */
/*
Here's a set of strings.
Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow",
"Mr.Red"));
Output each of its elements with the loop with a new line.
 */

public class Main {
    public static void main(String[] args) {
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        for (String name : nameSet) {
            System.out.println(name);
        }
    }
}

