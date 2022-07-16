import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        /*
        * Given integer N. Print all the squares of natural numbers, not exceeding N, in ascending order.
            Sample Input 1: 50
            Sample Output 1: 1 4 9 16 25 36 49
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 50
        int sq = 0;// 0
        int i = 1;// 1
        while (sq < n) {
            sq = i * i;
            i++;
            if (sq <= n) {
                System.out.print(sq + " ");
            }
        }
    }
}
