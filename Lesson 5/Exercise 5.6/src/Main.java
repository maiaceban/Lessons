import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        /*
        Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 –
        right, 0 – do not move) and outputs the text «move up» (or «move down», or «move left»,
        or «move right», or «do not move» depending on the entered number). If it is a number
        that does not belong to any of the listed directions, the program should output: «error!»
            Sample Input 1: 1
            Sample Output 1: move up
         */
        Scanner sc = new Scanner(System.in);

        int direction = sc.nextInt();
        switch (direction) {
            case 1 -> System.out.println("Move Up!");
            case 2 -> System.out.println("Move down!");
            case 3 -> System.out.println("Move left!");
            case 4 -> System.out.println("Move right!");
            case 0 -> System.out.println("Do not move!");
            default -> System.out.println("Error!");

        }
    }
}
