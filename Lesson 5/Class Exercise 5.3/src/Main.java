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
            case 1 -> st += "square";
            case 2 -> st += "circle";
            case 3 -> st += "triangle";
            case 4 -> st += "rhombus";
            default -> st += "There is no such shape!";
        }
        System.out.println(st);
    }
}
