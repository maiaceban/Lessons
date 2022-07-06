import java.time.LocalDate;
import java.util.Scanner;

/**
 * Is New Year coming or not? (Comparing dates and time)
 */
/*
Your task is to write a program that checks if the New Year will come in a specified
number of days (N) from the specified date.
Input data format: A single line containing a date in the year-month-day format and
an integer N separated by one space character.
Output data format: Just "true" or "false"
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.next());
        int days = scanner.nextInt();

        LocalDate newYearDate = localDate.plusDays(days);
        System.out.println(localDate.getYear() < newYearDate.getYear());
    }
}