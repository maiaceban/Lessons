import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Write a program that reads a string and then output another string with doubled characters.
        Sample Input: The
        Sample Output: TThhee
         */
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            System.out.print(sentence.charAt(i) + "" + sentence.charAt(i));

        }
    }
}
