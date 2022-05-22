import java.util.Scanner;
/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        /*
        Write a program that reads two lines and compares them without whitespaces. The
        program should prints true if both lines are equal, otherwise – false.
        Sample Input 1:              Sample Output 1: true
        string
        str ing
        Sample Input 2:               Sample Output 2: false
        string
        my string
         */
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String firstStringWithoutSpace = firstString.replaceAll(" ", "");
        String secondStringWithoutSpace = secondString.replaceAll(" ", "");

        System.out.println(firstStringWithoutSpace.equals(secondStringWithoutSpace));
    }
}
