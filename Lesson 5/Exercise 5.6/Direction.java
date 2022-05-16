package lesson5.exercise6;

import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int direction = sc.nextInt();
        switch (direction) {
            case 1 -> System.out.println("Move Up");
            case 2 -> System.out.println("Move down");
            case 3 -> System.out.println("Move left");
            case 4 -> System.out.println("Move right");
            case 0 -> System.out.println("Do not move");
            default -> System.out.println("error!");

        }
    }
}
