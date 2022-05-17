import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int J = scanner.nextInt();
        int U = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(J != U && J != C && C != U);
    }
}
