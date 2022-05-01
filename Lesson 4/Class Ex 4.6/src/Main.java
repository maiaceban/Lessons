import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Math.abs(scanner.nextInt());   // Represent Squirrels
        int K = Math.abs(scanner.nextInt());   // Represent Nuts
        if (N <= 10000 & K <= 1000) {
            System.out.println(K / N);
        } else {
            System.out.println("You inserted number bigger then 10000!");
        }
    }
}
