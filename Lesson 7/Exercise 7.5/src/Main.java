import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) throws IOException {
        /*
        Write a program that finds the frequency of occurrences of a substring in a given
        string. Substrings cannot overlap: for example, the string ababa contains only one substring aba.
        Input data format: The first input line contains a string, the second one contains a substring.
        Sample Input 1:                    Sample Output 1: 1
        hello there
        the
        Sample Input 2:                    Sample Output 2: 3
        hello yellow jello
        ll
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String substring = br.readLine();

        Pattern pattern = Pattern.compile(substring);
        Matcher matcher = pattern.matcher(word);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.print(count);

    }
}

