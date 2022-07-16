import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Write a program that reads a string s and an int n, and then moves the first n characters of s to the end of the string.
        The program must output the changed string. If n is greater than the length of the string,
        it must output the string unchanged. Note, the substring method can help you, but you may choose another way to
        solve the problem.  Input data format: The single input line contains s and n separated by a space.
            Sample Input 1: Hello 3             Sample Output 1: loHel
            Sample Input 2: Hello 10            Sample Output 2: Hello
         */
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int n = scanner.nextInt();

        for (int i = n; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
        if (n > word.length()) {
            System.out.println(word);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(word.charAt(i));
            }
        }
    }
}
