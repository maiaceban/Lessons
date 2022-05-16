import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("What is the value of x?: ");
        double x = scr.nextDouble();

        System.out.println(Math.pow(x, 3) + Math.pow(x, 2) + x + 1);

    }
}
