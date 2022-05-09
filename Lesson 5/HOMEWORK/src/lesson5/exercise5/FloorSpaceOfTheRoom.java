package lesson5.exercise5;

import java.util.Scanner;

public class FloorSpaceOfTheRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = ((a + b + c) / 2);
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println(s);
                break;

            case "rectangle":
                double a1 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                System.out.println(a1 * b2);
                break;

            case "circle":
                double Range = scanner.nextDouble();
                System.out.println(3.14 * Range * Range);
                break;

            default:
                break;

        }
    }
}
