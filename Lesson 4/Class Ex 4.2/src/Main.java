import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("What is the value of n?: ");
        int n = scr.nextInt();

        int result = ((n + 1) * n + 2) * n + 3;
        System.out.println(result);
    }
}
