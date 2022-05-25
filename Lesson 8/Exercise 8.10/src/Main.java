import java.util.Scanner;

public class Main {
    /*
    Write a method that has an int argument and computes the sum of all numbers from 1 to n.
    Try to make it using recursion.
        Sample Input 1: 5       Sample Output 1: 15
     */
    public static long sum(int s) {
        int sum = 0;
        for (int i = 0; i <= s; i++) {
            sum = sum + i;
        }
        return sum;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = sum(scanner.nextInt());
        System.out.println(sum);
    }
}
