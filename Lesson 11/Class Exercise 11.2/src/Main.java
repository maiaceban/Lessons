import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double pow = Math.pow(a, b);

        System.out.printf("%.4f", pow);

    }
}
