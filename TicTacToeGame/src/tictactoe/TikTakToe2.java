package tictactoe;

import java.util.Scanner;

/*
PART NR.2
 */
public class TikTakToe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
    }

    private static void print1(char[] chars) {
        //field has a specific format and should start and end with ---------
        System.out.println("---------");
        for (int i = 0; i < chars.length; i++) {
            if (i % 3 == 0) {
                // all lines in between should start and end with '|' symbol
                if (i != 0) {
                    System.out.println("|");
                }
                //and everything in the middle should be separated with a single space.
                System.out.println("| ");
            }
            System.out.print(chars[i] + " ");
        }
        System.out.println("|");
        System.out.println("---------");
    }

    private static void print2(char[] array) {
        System.out.println("---------");
        System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
        System.out.println("---------");
    }
}
