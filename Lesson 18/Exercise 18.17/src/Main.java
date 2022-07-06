import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * The passed hours since the beginning of year (LocalDateTime)
 */
/*
Write a program that reads a date-time pair and calculates how many hours have
passed since the beginning of the year (1st January, 00:00).
Input data format: The first line contains a date-time pair in the format
year-month-dayThour:minute:second.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine());

        int days = (dateTime.getDayOfYear() - 1) * 24;
        int hours = dateTime.getHour();

        System.out.println(days + hours);
    }
}