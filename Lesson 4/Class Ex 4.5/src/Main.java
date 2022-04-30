import java.util.Scanner;

/* Write a program that finds the number of tens in a non-negative integer N(0<N<100000).
 If N is 264, the number of tens is 6
 If N is 4136, the number of tens is 3
 If N is 101, the number of tens is 0 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((num % 100) / 10);


    }
}
