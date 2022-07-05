import java.time.LocalDate;
import java.util.Scanner;

/**
 * The first and the last day of a month (LocalDate)
 */
/*
Write a program that reads a year and a month and outputs the first and the last day
of this month.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        LocalDate firstDay = LocalDate.of(year, month, 1);
        int length = firstDay.lengthOfMonth();
        LocalDate lastDay = firstDay.withDayOfMonth(length);

        System.out.println(lastDay);
    }
}