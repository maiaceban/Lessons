package lesson5.exercise3;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();//20
        int t2 = scanner.nextInt();//21
        int t3 = scanner.nextInt();//22

        int res1 = (t1 + 1) / 2; // = 21 / 2 = 10
        int res2 = (t2 + 1) / 2; // = 22 / 2 = 11
        int res3 = (t3 + 1) / 2; // = 23 / 2 = 12
        System.out.println(res1 + res2 + res3); // = 32
    }
}
