package lesson5.exercise2;

import java.util.Scanner;

/**
 * 2.The army of units
 */

public class Army {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int army = sc.nextInt();

        if (army < 1) {
            System.out.println("No army");
        } else if (army <= 19) {
            System.out.println("Pack");
        } else if (army <= 249) {
            System.out.println("Throng");
        } else if (army <= 999) {
            System.out.println("Zounds");
        } else {
            System.out.println("Legion");
        }
    }
}



