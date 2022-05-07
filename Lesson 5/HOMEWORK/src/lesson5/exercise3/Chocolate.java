package lesson5.exercise3;

import java.util.Scanner;

/*
Think of chocolate as an N x M rectangle divided into little segments:
- N segments in length and M in width.
Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line:
vertical or horizontal.
Each segment is 1x1.
Input data format
The program gets an input of three integers: N, M, K.
Output data format
The program must output one of the two words: YES or NO.
 */
public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();//20
        int g2 = scanner.nextInt();//21
        int g3 = scanner.nextInt();//22

        int res1 = (g1 + 1) / 2; // = 21 / 2 = 10
        int res2 = (g2 + 1) / 2; // = 22 / 2 = 11
        int res3 = (g3 + 1) / 2; // = 23 / 2 = 12
        System.out.println(res1 + res2 + res3); // = 32
    }
}
