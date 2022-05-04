import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();  // i = 476

        int i1 = i / 100;  // 4
        int i2 = (i % 100) / 10;
        int i3 = i % 10;
        int resulte = i1 + i2 + i3;
        System.out.println(resulte);
    }
}