import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     * @param args
     */
    public static void main(String[] args) {
        /*
        N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after
        each of the squirrels takes the equal amount of nuts.
        There are two positive integers N and K, each of them is not greater than 10000.

        Sample Input 1: 3 14
        Sample Output 1: 2
         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();   // Represent Squirrels
        int K = scanner.nextInt();   // Represent Nuts
        if (N < 10000 & K < 1000) {
            System.out.println(K % N);
        } else {
            System.out.println("UPS! You inserted number bigger then 10000!");
        }

    }
}
