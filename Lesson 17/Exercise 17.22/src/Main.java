import java.util.*;

/**
 * Kidnapper of Ice cream (The Map interface)
 */
/*
Imagine now you are an outlaw in the Sherlock Holmes times. You are in need of
money, and you want to demand some by blackmailing. Obviously, you have to write a
letter completely anonymously because you do not want to be busted.
So you decide to compose a letter by cutting the required words from a newspaper.
In this problem, you get two lines:
1) available words you have in a newspaper,
2) your note.
Find out and print if you can write a note from available words ("You get money")
or you will be busted ("You are busted").
Remember: your note is case-sensitive
 */

public class Main {
    private static final Map<String, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newspaper = scanner.nextLine();
        String[] newspaperWords = newspaper.split(" ");

        for (String newspaperWord : newspaperWords) {
            MAP.put(newspaperWord, MAP.getOrDefault(newspaperWord, 0) + 1);
        }

        String phrase = scanner.nextLine();
        if (hasAllWords(phrase)) {
            System.out.println("You get money");
        } else {
            System.out.println("You are busted");
        }

    }

    public static boolean hasAllWords(String phrase) {
        for (String s : phrase.split(" ")) {
            if (MAP.containsKey(s)) {
                Integer count = MAP.get(s);
                if (count == 0) {
                    return false;
                }
                MAP.put(s, count - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}