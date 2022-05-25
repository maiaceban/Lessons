import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        GC-content is an important feature of the genome sequences and is defined as the percentage ratio
        of the sum of all guanine's and cytosine's to the overall number of nucleic bases in the genome sequence.
        Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine)
        in the entered string. Your program should be case independent.
        For example, in the string "acggtgttat" the percentage of characters G and C equals to ,
        where 4 is the number of symbols G and C, and 10 is the length of 4 10 · 100 = 40 the string.
        Remember: characters are case-insensitive(g equals G and c equals C)
        Input data format: The single input line contains a sequence.
        Output data format: The percentage of G and C characters as a double. Do not round/format the value, output it as is.
            Sample Input: acggtgttat
            Sample Output: 40.0
         */

        Scanner scanner = new Scanner(System.in);
        String genome = scanner.nextLine().toLowerCase();

        String[] chars = genome.split("");
        double count = 0.0;
        for (String ch : chars) {
            if (ch.equals("g") || ch.equals("c")) {
                count++;
            }
        }
        double result = count / chars.length * 100;
        System.out.println(result);
    }
}
