import java.util.Scanner;

/**
 * substring() method
 */
public class Main {
    public static void main(String[] args) {
        /*
        Write a program that reads a string, and then outputs the string without its middle character
         when the length is odd, and without the middle 2 characters when the length is even.
        Hint: Remember substring() method. It can help you a lot.
            Sample Input 1: Hello       Sample Output 1: Helo
            Sample Input 2: abcd        Sample Output 2: ad
         */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder(str);
        int i = str.length() / 2;
        sb.deleteCharAt(i);
        if (str.length() % 2 == 0) {
            sb.deleteCharAt(i - 1);
        }
        System.out.println(sb);
    }
}
