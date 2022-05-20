import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            int temp = scanner.nextInt();
            arr[i] = temp;
        }
        int count = 1;
        int temCounter = 1;

        for (int i = 1; i < arr.length; i++) {
            int precedent = arr[i - 1];
            int current = arr[i];

            if (precedent < current) {
                temCounter++;
                if (temCounter > count) {
                    count++;
                }
            } else {
                temCounter = 1;
            }
        }
        System.out.println(count);
    }
}
