import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        // or String result = "No"
        if (i > 0) {
            System.out.println("YES");
            // result = "Yes"
            // System.out.println(result)
        } else if (i < 0) {
            System.out.println("NO");
        } else
            System.out.println("Zero");
    }
}