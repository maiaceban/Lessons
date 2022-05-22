import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String substring = string.substring(a, b + 1);
        System.out.println(substring);
    }
}
