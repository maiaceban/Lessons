import java.util.Scanner;

public class Main {
    /**
     *
     */
    public static void main(String[] args) {

        /* Java Method to solve FizzBuzz problem, which states that program
         * should print Fizz if number is multiple of 3,
         * print Buzz if number is multiple
         * of 5, and print FizzBuzz if number is multiple of both 3 and 5
         * Output each number or the word on a separate line.
         *  Sample Input 1: 8 16
            Sample Output 1:
            8
            Fizz
            Buzz
            11
            Fizz
            13
            14
            FizzBuzz
            16
         */

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = sc.nextInt();

        for (int i = b; i <= e; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
