import java.util.Scanner;

/**
 * ArrayIndexOutOfBoundsException
 */
/*
Make sure the exception is not thrown index is not valid
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("\\s+");
        int i = Integer.parseInt(scanner.next());

        if (i > s.length - 1 || i < 0) {
            System.out.println("No such element.");
        } else {
            System.out.println(s[i]);
        }

    }
}
// \\s+ ----> spatiu de la 1 si mai mult