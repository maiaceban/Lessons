import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine(); //one two three four five six

        String[] words = line.split(" ");

        String result = words[0]; //one
        for (int i = 1; i < words.length; i++) {
            String word = words[i]; //two
            if (result.length() < word.length()) {
                result = word;
            }
        }
        System.out.println(result);
    }

}

