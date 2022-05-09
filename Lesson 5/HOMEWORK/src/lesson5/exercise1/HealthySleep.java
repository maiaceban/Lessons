package lesson5.exercise1;

import java.util.Scanner;

/**
 * 1.Healthy sleep
 */

public class HealthySleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();

        if (H >= A && H <= B) {
            System.out.println("normal");
        } else if (H < A) {
            System.out.println("excess");
        } else
            System.out.println("deficiency");
    }

}
