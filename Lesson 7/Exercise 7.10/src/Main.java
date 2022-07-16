import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        /*
        A password is hard to crack if it contains at least A uppercase letters, at least B
        lowercase letters, at least C digits and consists of exactly N symbols. Also, a password
        cannot contain two or more of the same characters in a row.
        For the given numbers A, B, C, and N, you should output a password that matches
        these requirements.
        It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <=N.
        Keep in mind that any parameter can be equal to zero. It means that it's ok if the
        password doesn't contain symbols of such type.

        Sample Input 1: 3 2 3 10
        Sample Output 1: ABCab012DE
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        char lowerChar = 'a';
        char upperChar = 'A';
        int digit = 0;

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < a; i++) {
            password.append(upperChar);
            upperChar = upperChar == 'Z' ? 'A' : ++upperChar;
        }
        for (int i = 0; i < b; i++) {
            password.append(lowerChar);
            lowerChar = lowerChar == 'z' ? 'a' : ++lowerChar;

        }
        for (int i = 0; i < c; i++) {
            password.append(digit);
            digit = digit == 9 ? 8 : ++digit;
        }
        while (password.length() < n) {
            password.append(upperChar);
            upperChar = upperChar == 'Z' ? 'A' : ++upperChar;
        }
        System.out.println(password);
    }
}
