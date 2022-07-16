import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();//1
        int b = s.nextInt();//3
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }


        // for(;a <= b; a++) {
        //  sum += a;
        // }

        System.out.println(sum);
    }
}
