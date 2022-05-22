import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfElements = scanner.nextInt();
        long max = 0;

        for (int i = 0; i < nrOfElements; i++) {
            int nr = scanner.nextInt();
            if (nr % 4 == 0 && nr > max) {
                max = nr;
            }
        }

        System.out.println(max);
    }
}
//12 16 87 58 25 73 86 36 79 40 12 89 32
//40