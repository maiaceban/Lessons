import java.util.Scanner;

public class Palindrome {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        /*
         * Write a program that reads a string and checks whether it is a palindrome, i.e. it
         * reads the same both left-to-right and right-to-left.
         * The program must output “yes” if the string is a palindrome and “no” otherwise.
         * Sample Input: kayak
         * Sample Output: yes
         */

        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


