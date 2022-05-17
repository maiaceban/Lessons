import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

//        String st = "You have chosen a ";
//        switch (i) {
//            case 1 -> st += "square";
//            case 2 -> st += "circle";
//            case 3 -> st += "triangle";
//            case 4 -> st += "rhombus";
//            default -> st = "There is no such shape!";
//        }

        String st = switch (i) {
            case 1 -> "You have chosen a square";
            case 2 -> "You have chosen a circle";
            case 3 -> "You have chosen a triangle";
            case 4 -> "You have chosen a rhombus";
            default -> "There is no such shape!";
        };
        System.out.println(st);
    }
}
