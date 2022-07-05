import java.time.LocalDateTime;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.HOURS;

/**
 * Whole hours between two date-time pairs (LocalDateTime)
 */
/*
Write a program that calculates how many whole hours are between the two
date-time pairs of the same year.
Input data format:
Two lines containing a date-time in a year-month-dayThour:minute format (without
seconds and nanoseconds).
Output data format:
The line containing an integer non-negative number.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime dateTime1 = LocalDateTime.parse(scanner.next());
        LocalDateTime dateTime2 = LocalDateTime.parse(scanner.next());

        System.out.println(HOURS.between(dateTime1, dateTime2));
    }
}