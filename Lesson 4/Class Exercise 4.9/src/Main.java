import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        /*
         * Write a program that reads three integer numbers and prints true if the first number is
         * between the second and the third one (inclusive). Otherwise, it must orin false.
         * The sorting order of two last arguments can be any.
         *
         * Sample Input 1: 3 3 3         Sample Output 1: true
         * Sample Input 2: 2 7 9         Sample Output 1: false
         * Sample Input 3: 40 100 20     Sample Output 1: true
         * Sample Input 4: 2 1 3         Sample Output 1: true
         */
        Scanner scanner = new Scanner(System.in);
        int integer1 = scanner.nextInt();
        int integer2 = scanner.nextInt();
        int integer3 = scanner.nextInt();
        boolean b1 = integer1 <= integer2 && integer1 >= integer3;
        boolean b2 = integer1 <= integer3 && integer1 >= integer2;
        System.out.println(b1 || b2);
    }
}
