import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        boolean result = i < 10 && i > 0;
        System.out.println(result);
    }
}
