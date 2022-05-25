import java.util.Scanner;

public class Main {
    /*
    Given a recursive method which should print an input string in the reverse order.
    Now the method prints the string in the same order. Fix the method.
    After your fix, the method must be recursive.
        Sample Input 1: ousyn
        Sample Output 1: nysuo
     */

    /* Fix this method */
    public static void printReverseCharByChar(String s) {
        char[] resultarray = s.toCharArray();
        //iteration
        for (int i = resultarray.length - 1; i >= 0; i--)
            // print reversed String
            System.out.print(resultarray[i]);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}

