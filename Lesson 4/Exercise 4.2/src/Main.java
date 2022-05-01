import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // Represent Squirrels
        int K = sc.nextInt();   // Represent Nuts
        if (N < 10000 & K < 1000) {
            System.out.println(K / N);
        }
    }
}
