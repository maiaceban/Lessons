import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = j - i;
                int a = temp < 0 ? -temp : temp;// daca temp < 0, noi il negam, iar daca temp >= 0, atunci in a o sa tinem temp.
                matrix[i][j] = a;
            }
        }
        for (int[] ints : matrix) {
            for (int temp : ints) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
