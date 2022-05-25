import java.util.Scanner;

public class Main {
        /*
        Write a method that calculates the factorial of a given number. The factorial of n is
        calculated by the product of integer number from 1 to n (inclusive). The factorial of 0 is equal to 1.
            Sample Input 1: 0
            Sample Output 1: 1
            Sample Input 2: 5
            Sample Output 2: 120
         */
    public static long factorial(long n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

//    public static long factorial(long n) {
//        return n <= 1 ? 1 : n * factorial(n - 1);
//    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}

