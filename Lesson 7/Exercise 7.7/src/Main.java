import java.util.Locale;
import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        /*
        Write a program that checks if a given string starts with the prefix "J" ignoring the case.
        The program should output true or false.
        Sample Input 1: Java                   Sample Output 1: true
        Sample Input 2: Kotlin                 Sample Output 2: false
         */
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println(string.toLowerCase(Locale.ENGLISH).startsWith("j"));
    }
}
