import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        /*
        Write a program that reads an integer value and checks if it is less than 10 and
        greater than 0. Your program should print a boolean value (true or false).
            Sample Input: 0
            Sample Output: false
         */
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        boolean result = i < 10 && i > 0;
        System.out.println(result);
    }
}
