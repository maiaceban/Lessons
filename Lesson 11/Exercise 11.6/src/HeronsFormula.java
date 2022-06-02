import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        double s1, s2, s3, area, S;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter Three Sides of a Triangle");
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();

        /*
         * Area of any triangle = sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree))
         * Where s = (sideOne + sideTwo + sideThree)/2
         */
        S = (s1 + s2 + s3) / 2;
        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));

        System.out.format("The Area of triangle = %.1f\n", area);
    }
}
