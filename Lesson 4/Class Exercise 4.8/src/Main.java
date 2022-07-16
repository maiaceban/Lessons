import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     * @param args
     */
    public static void main(String[] args) {
        /*
        Write a program that reads three double values a,b,c and then solving the simplest equation:
        a * x + b = c. The program should output the value of X. It's guaranteed, a is not 0
        Sample Input 1: 2 -1 2
        Sample Output 1: 1.5

         */
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        //a * x + b = c;
        //a * x = c - b;
        //x = (c - b) / a;
        System.out.println((c - b) / a);
    }
}
