import java.util.Scanner;

import static java.lang.Long.sum;

public class Main {
    /*
    It is possible to find a n-th power much quicker than by making n multiplications!
    To do this you need to use the following recurrence relations: ....
    Implement the algorithm of quick exponentiation using a recursion method.
        Sample Input 1:                 Sample Output 1: 2.0
        2.0
        1
        Sample Input 2:                 Sample Output 2: 57.665
        1.5
        10
     */

    public static double power(double a, long n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return power(a * a, n / 2);
        } else {
            return a * power(a, n - 1);
        }
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double power = scanner.nextDouble();
        System.out.println(power);
    }


}
