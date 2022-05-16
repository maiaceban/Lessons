package lesson5.exercise7;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        /* Java Method to solve FizzBuzz problem, which states that program
         * should print Fizz if number is multiple of 3,
         * print Buzz if number is multiple
         * of 5, and print FizzBuzz if number is multiple of both 3 and 5
         *
         * */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        System.out.println("The FizzBuzz numbers will be: ");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) { //multiple of 3
                System.out.print("Fizz");
            } else if (i % 5 == 0) { //multiple of 5
                System.out.print("Buzz");
            } else if ((i % 3 == 0) && (i % 5 == 0)) { //multiple of 3 & 5
                System.out.print("FizzBuzz");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        s.close();
    }
}

