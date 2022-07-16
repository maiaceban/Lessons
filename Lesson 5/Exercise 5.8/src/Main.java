import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        /*
        Write a program that prints the product of all integer numbers from a to b (a < b).
        Include a and exclude b from the product. If you input 1 and 3 it should calculate 1 * 2 * 3.
            Sample Input 1: 1 2
            Sample Output 1: 1
            Sample Input 2: 100 105
            Sample Output 2: 11035502400
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long result = 1;
        for (int i = a; i < b; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
