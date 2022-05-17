import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt(); // first line  5

        int[] arr = new int[arraySize]; // [0, 0, 0, 0, 0]

        for (int i = 0; i < arraySize; i++) {
            int temp = scanner.nextInt();
            arr[i] = temp;
        }
        //5 8 11 2 10
        //8
        int n = scanner.nextInt();
        int sum = 0;

        for (int temp : arr) {
            if (temp > n) {
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}

