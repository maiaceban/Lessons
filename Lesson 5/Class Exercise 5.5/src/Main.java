import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int max = i;

        while (i != 0) {
            if (i > max) {
                max = i;
            }
            i = scanner.nextInt();
        }
        System.out.println(max);
    }
}
