import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

//        if (number > 0) {
//            System.out.println("Yes");
//        } else
//            System.out.println("No");

        String result = number > 0 ? "Yes" : "NO";
        System.out.println(result);
    }
}



