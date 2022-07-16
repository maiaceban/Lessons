import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Subtracting hours and adding minutes (LocalDateTime)
 */
/*
Write a program that subtracts N hours and adds M minutes to a date-time pair.
Input data format:
The first line contains a date-time pair (year-month-dayThours:minutes). The second
line contains two numbers separated by a space: hours to subtract and minutes to add.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.next());

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        System.out.println(dateTime.minusHours(hours).plusMinutes(minutes));
    }
}