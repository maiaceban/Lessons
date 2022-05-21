import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     * @param args
     */
    public static void main(String[] args) {
        /*
        Write a program which reads a double value x and evaluates the result of
                                         Math.pow(x, 3) + Math.pow(x, 2) + x + 1
        Sample Input 1: 22.5
        Sample Output 1: 11920.375
         */
        Scanner scr = new Scanner(System.in);
        System.out.println("What is the value of x?: ");
        double x = scr.nextDouble();

        System.out.println(Math.pow(x, 3) + Math.pow(x, 2) + x + 1);

    }
}
