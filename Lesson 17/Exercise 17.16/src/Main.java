import java.util.*;

/**
 * Spell checker (The Set interface)
 */
/*
The simplest spell checker is the one based on a list of known words. Every word in
the text is being searched for in this list and, if such word was not found, it is marked as
erroneous. Write such a spell checker.
The first line of the input contains d – number of records in the list of known words.
Next go d lines containing one known word per line, next — the number l of lines of the
text, after which — l lines of the text.
Write a program that outputs those words from the text that are not found in the
dictionary (i.e. erroneous). Your spell checker should be case insensitive. The words are
entered in an arbitrary order. Words, which are not found in the dictionary, should not be
duplicated in the output.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();

        Set<String> words = new TreeSet<>();
        for (int i = 0; i < d; i++) {
            words.add(scanner.next().toLowerCase());
        }
        int l = scanner.nextInt();
        scanner.nextLine();

        Set<String> unknown = new HashSet<>();
        for (int i = 0; i < l; i++) {
            String sentence = scanner.nextLine().toLowerCase();
            String[] split = sentence.split(" ");
            for (String word : split) {
                boolean contains = words.contains(word.toLowerCase());
                if (!contains) {
                    unknown.add(word);
                }
            }
        }


        for (String s : unknown) {
            System.out.println(s);
        }
    }
}
//input:
/*
3
a
bb
cCc
2
a bb aab aba ccc
c bb aaa
 */