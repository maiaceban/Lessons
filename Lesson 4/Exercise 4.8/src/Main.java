import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */

    public static void main(String[] args) {
        /*
        Write a program that reads three numbers and checks that they all are different, i.e.
        not equal to one another. The output should be true or false.
            Sample Input: 5 5 9
            Sample Output: false
         */
        Scanner scanner = new Scanner(System.in);
        int J = scanner.nextInt();
        int U = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(J != U && J != C && C != U);
    }
}
