import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int nrOfBridges = scanner.nextInt();

        for (int i = 1; i <= nrOfBridges; i++) {
            int height = scanner.nextInt();
            if (busHeight >= height) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if (i == nrOfBridges) {
                System.out.println("Will not crash");
            }
        }
    }
}
