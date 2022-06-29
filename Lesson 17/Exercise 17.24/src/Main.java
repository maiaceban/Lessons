import java.util.*;

/**
 * Sherlock Holmes and the mystery of anagrams (The Map interface)
 */
/*
In this problem, you are Sherlock Holmes and you want to quickly detect all anagrams.
Write a program that finds out whether two words are anagrams or not. If one word
is an anagram of another, print "yes", else print "no".
Note: anagrams are words that contain the same characters with the same
frequencies. In other words, anagrams are created by changing the order of letters in the word.

For example:
● "ppaaagg" (2 p, 3 a, 2 g) and "gagaapp" (2 ps, 3 as, 2 gs) are anagrams;
● "hello" (1 h, 1 e, 2 l, 1 o) and "helllo" (1 h, 1 e, 3 ls, 1 o) are not anagrams.
Remember: anagrams are case-insensitive.
 */
public class Main {
    private static final Map<Character, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next().toLowerCase();
        for (char ch : firstWord.toCharArray()) {
            MAP.put(ch, MAP.getOrDefault(ch, 0) + 1);
        }

        String secondWord = scanner.next().toLowerCase();
        if (firstWord.length() != secondWord.length()) {
            System.out.println("no");
            return;
        }

        for (char ch : secondWord.toCharArray()) {
            if (MAP.containsKey(ch)) {
                Integer val = MAP.get(ch);
                if (val > 0) {
                    MAP.put(ch, val - 1);
                } else {
                    System.out.println("no");
                    return;
                }
            } else {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}