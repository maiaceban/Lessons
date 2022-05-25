import java.util.Scanner;

public class Main {

    /**
     * Tekwill Academy
     * Java Fundamentals
     */

    public static void main(String[] args) {
        /*
        Write a program that reads a string and outputs "true" only when the letters of this
        string form a substring of the ordered English alphabet, for example, "abc", "xy", "pqrst".
        Otherwise, it should print out "false".
        Note: string can consist of a single character. Assume an empty string as an alphabet substring.
            Sample Input 1: abc Sample Output 1: true
            Sample Input 2: bce Sample Output 2: false
         */

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();

        boolean ordered = true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) - str.charAt(i - 1) != 1) {
                ordered = false;
                break;
            }
        }
        System.out.println(ordered);
    }
}
