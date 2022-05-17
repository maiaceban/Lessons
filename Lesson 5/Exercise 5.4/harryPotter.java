package lesson5.exercise4;

import java.util.Scanner;

public class harryPotter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String house = scanner.nextLine();
        switch (house) {
            case "gryffindor" -> System.out.println("Bravery!");
            case "hufflepuff" -> System.out.println("Loyalty!");
            case "slytherin" -> System.out.println("Cunning!");
            case "raven claw" -> System.out.println("Intellect!");
            default -> System.out.println("Not a valid house!");
        }
    }
}
