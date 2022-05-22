import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number > 0 ? "YES" : "NO";
        System.out.println(result);
    }
}
