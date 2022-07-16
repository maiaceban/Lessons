import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Add days and subtract hours (LocalDateTime)
 */
/*
Write a program that changes the given point of time: adds a certain number of days
and subtracts a few hours. Input and output date-time like this "2017-12-31T22:30".
Input data format: The single line containing date-time and two numbers: days to
add and hours to subtract. Input elements are separated by spaces.
Output data format: The output must contain only a date-time in the specified
format.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.next());
        int days = scanner.nextInt();
        int hours = scanner.nextInt();

        System.out.println(dateTime.plusDays(days).minusHours(hours));
    }
}