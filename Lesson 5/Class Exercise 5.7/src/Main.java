import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        boolean condition = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(condition ? "Leap" : "Regular");
    }
}
