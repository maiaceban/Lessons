import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nr1 = scanner.nextLong();
        String op = scanner.next();
        long nr2 = scanner.nextLong();

        switch (op) {
            case "+" -> System.out.println(nr1 + nr2);
            case "-" -> System.out.println(nr1 - nr2);
            case "/" -> {
                if (nr2 != 0) {
                    System.out.println(nr1 / nr2);
                } else {
                    System.out.println("Division by 0!");
                }
            }
            case "*" -> System.out.println(nr1 * nr2);
            default -> System.out.println("Unknown operator");
        }
    }
}
