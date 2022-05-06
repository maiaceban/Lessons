package lesson5.exercise3;

import java.util.Scanner;

/*
Think of chocolate as an N x M rectangle divided into little segments:
- N segments in length and M in width.
Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line:
vertical or horizontal.
Each segment is 1x1.
Input data format
The program gets an input of three integers: N, M, K.
Output data format
The program must output one of the two words: YES or NO.
 */
public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (k <= n * m && (k % n == 0 && k >= n || k % m == 0 && k >= m)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
