import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < nr; i++) {
            int temp = scanner.nextInt();
            if (temp % 6 == 0) {
                sum += temp;
            }
        }

        System.out.println(sum);
        // Input: 8 11 12 68 6 98 81 36 86
        // Output: 54
    }
}
