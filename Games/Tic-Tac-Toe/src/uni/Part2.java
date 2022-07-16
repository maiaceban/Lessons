package uni;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();


    }

    private static void print1(char[] chars) {
        System.out.println("---------");
        for (int i = 0; i < chars.length; i++) {
            if (i % 3 == 0) {
                if (i != 0) {
                    System.out.println("|");
                }
                System.out.print("| ");

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