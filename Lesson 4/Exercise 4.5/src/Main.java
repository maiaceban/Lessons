import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float distance = sc.nextFloat();
        float time = sc.nextFloat();

        System.out.println("The average speed of the bus is: " + distance / time);
    }
}
