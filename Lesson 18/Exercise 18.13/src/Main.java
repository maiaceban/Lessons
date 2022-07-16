import java.time.LocalTime;
import java.util.Scanner;

/**
 * Seconds between two time points (LocalTime)
 */
/*
Implement a method that takes two instances of LocalTime and determines how
many seconds are between them.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time1 = LocalTime.parse(scanner.nextLine());
        LocalTime time2 = LocalTime.parse(scanner.nextLine());

        int seconds1 = time1.toSecondOfDay();
        int seconds2 = time2.toSecondOfDay();
        System.out.println(Math.abs(seconds1 - seconds2));
    }
}