import java.util.Scanner;

public class Main {
    /*
Implement a method sumInRange for calculating the sum of numbers in the range
from (inclusive), to (exclusive).

Sample Input 1: 1 2              Sample Output 1: 1
Sample Input 2: 5 5              Sample Output 2: 0
Sample Input 3: 10 15            Sample Output 3: 60
      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int from = sc.nextInt();
         int to = sc.nextInt();

         sumInRange(from, to);
    }

    public static void sumInRange(int from, int to) {
       int sum =0;
        for (int i = from + 1; i < to; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
