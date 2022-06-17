import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringReverser reverser = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reverser.reverse(line));

    }
}
