import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        boolean onlyFirstIsPositive = i > 0 && j <= 0 && k <= 0; //true
        boolean onlySecondIsPositive = i <= 0 && j > 0 && k <= 0; //false
        boolean onlyThirdIsPositive = i <= 0 && j <= 0 && k > 0;

        boolean exactlyOneIsPositive = onlyFirstIsPositive||onlySecondIsPositive||onlyThirdIsPositive;
        System.out.println(exactlyOneIsPositive);

        // System.out.println((i>0 && j<=0 && k<=0) || (j>0 && i<=0 && k<=0) || (k>0 && j<=0 && i<=0)

    }
}
