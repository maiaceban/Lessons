import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     * @param args
     */
    public static void main(String[] args) {
        /*
        Write a program that reads the number a,b,c and checks if any pair of them sums to 20.
        The program must output true or false
        Sample Input 1: 1 2 3          Simple Output 1: false
        Sample Input 2: 4 16 7         Simple Output 2: true
         */
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b == 20 || a + c == 20 || b + c == 20);
    }
}
