import java.util.Scanner;
/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        /*
        Upon learning that DNA is not a random string, freshmen of the Bioinformatics
        Institute from the informatics group suggested using a compression algorithm that
        compresses repeated characters in a string. Encoding is performed as follows:
        The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the
        same characters of the input string are replaced by the symbol and the number of its
        repetitions in this string. Write a program, which reads the string, encodes it by this
        algorithm, and outputs the encoded sequence. The encoding must be case sensitive.
        Sample Input 1: aaaabbcaa                 Sample Output 1: a4b2c1a2
        Sample Input 2: abc                       Sample Output 2: a1b1c1
        Sample Input 3: aaaaa                     Sample Output 3: a5
         */

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder str1 = new StringBuilder();

        char[] array = string.toCharArray();
        int c = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                c++;
                if (i != array.length - 1)
                    continue;
            }
            str1.append(array[i - 1]).append(c);
            c = 1;
        }
        System.out.println(str1);
    }
}
