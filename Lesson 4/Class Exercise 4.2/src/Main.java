import java.util.Scanner;

public class Main {
    /**
     * Java Fundamentals
     * @param args
     */
    public static void main(String[] args) {
        /*
        Write a program that reads an integer value n from the standard input and outputs
        the result of the following arithmetic expression: ((n + 1) * n + 2) * n + 3
        Sample Input 1: 3
        Sample Output 1: 45
         */
        Scanner scr = new Scanner(System.in);
        System.out.println("What is the value of n?: ");
        int n = scr.nextInt();

        int result = ((n + 1) * n + 2) * n + 3;
        System.out.println(result);
    }
}
