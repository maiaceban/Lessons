import java.time.LocalDate;
import java.util.Scanner;

/**
 * Is the date between the two other dates? (Comparing dates and time)
 */
/*
Write a program that checks if the date X is located between dates M and N on the
timeline and that these dates are not equal. Your program should read three dates from
the standard input. Each date should have a year-month-day format.
Input data format: The single line containing three dates (X, M, N) separated by the space character.
Output data format: The program must output "true" or "false".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate datesX = LocalDate.parse(scanner.next());
        LocalDate datesM = LocalDate.parse(scanner.next());
        LocalDate datesN = LocalDate.parse(scanner.next());

        boolean date = datesX.isAfter(datesN) && datesX.isBefore(datesM) ||
                datesX.isAfter(datesM) && datesX.isBefore(datesN);

        System.out.println(date);
    }
}