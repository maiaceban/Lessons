import java.util.Scanner;

public class MutableStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();

        StringBuilder name = new StringBuilder("Juc Gabriel");
        name.delete(1, 3);
        name.delete(3, 10);
        System.out.println(name);
    }
}
