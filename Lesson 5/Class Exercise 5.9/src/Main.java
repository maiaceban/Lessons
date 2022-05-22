import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();//220

        int i4 = number % 10;//0
        int i3 = (number / 10) % 10;//22 % 10 = 2
        int i2 = (number / 100) % 10;//2 % 10 = 2
        int i1 = number / 1000;// 0

        boolean isSymmetric = i4 == i1 && i3 == i2;

        System.out.println(isSymmetric ? 1 : number);
    }
}
