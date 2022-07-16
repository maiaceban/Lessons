import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) break;
            sum += i;
        }
        System.out.println(sum);
    }
}
//3 6 8 0
//17
