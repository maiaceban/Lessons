import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();   // Represent Squirrels
        int n = sc.nextInt();   // Represent Nuts
        System.out.println(n / s);
    }
}
