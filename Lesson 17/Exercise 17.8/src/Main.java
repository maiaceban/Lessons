import java.util.*;

public class Main {
    /**
     * The longest string in the list (The List interface)
     */
    /*
Implement the changeList method so that it:
1. finds the longest string in the list
2. replaces all list items with the found string
     */
    static void changeList(List<String> list) {
        int maxLenght = Integer.MIN_VALUE;
        String longWord = "";

        for (String word : list) {
            if (word.length() > maxLenght) {
                maxLenght = word.length();
                longWord = word;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, longWord);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
//Sample Input 1: hi hello goodmorning
//Sample Output 1: goodmorning goodmorning goodmorning
