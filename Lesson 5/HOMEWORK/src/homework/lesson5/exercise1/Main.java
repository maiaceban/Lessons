package homework.lesson5.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();

        if (A <= B) {
            System.out.println("Normal");
        } else if (A > H) {
            System.out.println("Excess");
        } else
            System.out.println("Deficiency");
    }
}
