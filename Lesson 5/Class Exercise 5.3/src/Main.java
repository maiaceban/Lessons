import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();

        String st = "You have chosen a ";

        switch (f) {
            case 1 -> st += "Square";
            case 2 -> st += "Circle";
            case 3 -> st += "Triangle";
            case 4 -> st += "Rhombus";
            default -> st += "There is no such shape!";
        }
        System.out.println(st);
    }
}
