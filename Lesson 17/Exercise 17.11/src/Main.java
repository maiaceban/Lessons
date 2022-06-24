import java.util.*;

/**
 * Creating a set (The Set interface)
 */
/*
Create TreeSet named set and fill it with the following three strings "Gamma", "Alpha", "Omega".
 */
public class Main {
    public static void main(String[] args) {

        TreeSet<String> set =  new TreeSet<>();
        set.add("Gamma");
        set.add("Alpha");
        set.add("Omega");

        System.out.println(set);
    }
}
