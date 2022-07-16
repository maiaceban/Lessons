import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Find all mondays (LocalDate)
 */
/*
Write a program that reads a year and the number of a month (1-12) and prints the
dates of all Mondays of this month in the correct order (from the first to the last).
Hint: look for the method getDayOfWeek(), it returns an enum value.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        while (date.getMonth().getValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
    }
}