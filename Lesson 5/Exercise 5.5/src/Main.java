import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
            /*
            Residents of the country of Male-via often experiment with the plan of their rooms.
            Rooms can be triangular, rectangular, and round. Write a program that calculates the
            forage of the rooms.
            Input data format: The type of the room shape and the relevant parameters.
            Output data format: The area of the resulting room.
            Note that the value of 3.14 is used instead of the number π in Male-via.
            Input format used by the Malians:
            where a, b and c — lengths of the triangle sides.
            where a and b — lengths of the rectangle sides.
            where r — circle radius.
            Note, the input values (a, b, c, r) are doubles and your answer should be, too.
                Sample Input 1:
                rectangle
                4
                10
                Sample Output 1:40.0
                Sample Input 2:
                circle
                5
                Sample Output 2: 78.5
                Sample Input 3:
                triangle
                3
                4
                5
                Sample Output 3: 6.0
             */
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
                double r = scanner.nextDouble();
                System.out.println(3.14 * r * r);
                break;

            default:
                break;

        }
    }
}
