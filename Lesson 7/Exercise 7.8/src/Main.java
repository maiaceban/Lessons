import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        /*/
        Write a program that reads a string with multiple words, and concatenate all words
        to a single long string. You must skip all digits inside the input strings.
        Use StringBuilder to solve the problem.
        Sample Input: T7est i1nput
        Sample Output: Testinput
         */

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        StringBuilder str = new StringBuilder(string); // T7est i1nput
        str.deleteCharAt(1);
        str.deleteCharAt(4);
        str.deleteCharAt(5);
        System.out.println(str);
    }
}
