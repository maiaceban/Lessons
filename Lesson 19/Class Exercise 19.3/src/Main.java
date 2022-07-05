import java.util.Scanner;
/**
 * Catch IndexOutOfBoundsException
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] s = scanner.nextLine().split("\\s+");
            int i = Integer.parseInt(scanner.next());
            System.out.println(s[i]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("No such element!");
        }
    }
}