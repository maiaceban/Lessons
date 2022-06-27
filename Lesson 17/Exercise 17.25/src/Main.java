import java.util.*;

/**
 * Sherlock Holmes and removing of characters (The Map interface)
 */
/*
For this problem, imagine that you are Sherlock Holmes. You've deduced that the
clues are somehow hidden within the pairs of words that contain only the same letters
with the same frequencies. To crack the case, you now need to find out how many
characters must be deleted to get such words (character sequences) from the given
ones.
For example: for two words "case" and "seal" you'll need to remove characters "c"
and "l" respectively to get "ase" and "sea". In this case, the answer is 2 ("c" and "l").
Remember: these "words" are case-insensitive
 */
public class Main {
    private static final Map<Character, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next().toLowerCase();
        String word2 = scanner.next().toLowerCase();

        for (char achar : word1.toCharArray()) {
            MAP.put(achar, MAP.getOrDefault(achar, 0) + 1);
        }

        int count = 0;
        for (char ch : word2.toCharArray()) {
            if (MAP.containsKey(ch)) {
                Integer val = MAP.get(ch);
                if (val > 0) {
                    MAP.put(ch, val - 1);
                } else {
                    MAP.remove(ch);
                    count++;
                }
            } else {
                count++;
            }
        }
        for (Integer value : MAP.values()) {
            count += value;
        }

        System.out.println(count);
    }
}