import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        /*
        For its input, the program gets a sequence of non-negative integers; each integer is
        written in a separate line. The sequence ends with an integer 0; when the program reads
        0, it should end its work and output the length of the sequence (not counting the final 0).
        Don’t read numbers following the number 0.
            Sample Input 1: 1 7 9 0 5
            Sample Output 1: 3
         */
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int in;
        do {
            in = sc.nextInt();
            if (in != 0) {
                count++;
            }
        } while (in != 0);

        System.out.println(count);
    }
}
