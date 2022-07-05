import java.time.LocalDate;
import java.util.Scanner;

/**
 * The n-th day from the end of a month (LocalDate)
 */
/*
Write a program that prints the n-th day from the end of a month.
The program must read the year, the month, and the remaining number of days till
the end of the month from standard input and then output the date.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int remainingNumberOfDays = sc.nextInt() - 1;

        LocalDate date = LocalDate.of(year, month, 1);

        int lenght = date.lengthOfMonth();
        LocalDate localDate = date.withDayOfMonth(lenght).minusDays(remainingNumberOfDays);
        System.out.println(localDate);
    }
}