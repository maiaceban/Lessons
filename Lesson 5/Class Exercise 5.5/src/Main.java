import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int max = i;

        while (i != 0) {
            if (i > max) {
                max = i;
            }
            i = sc.nextInt();
        }
        System.out.println(max);
    }
}
