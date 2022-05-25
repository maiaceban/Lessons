import java.util.Scanner;

public class Main {
    /**
     *
     */
    public static void main(String[] args) {
        /*
        Write a program that takes a sentence as input and returns the index of the first
        occurrence of the word "the" (can be part of a word), regardless of the capitalization. If
        there is no occurrence of it must output -1.
        Note, the and They are equal.
            Sample Input 1: The apple is red.              Sample Output 1: 0
            Sample Input 2: I ate the red apple.           Sample Output 2: 6
            Sample Input 3: I love apples.                 Sample Output 3: -1
         */

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();

        System.out.println(sentence.indexOf("the"));
    }
}
