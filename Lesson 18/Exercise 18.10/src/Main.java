import java.time.LocalDate;
import java.util.Scanner;

/**
 * The last day of a month (LocalDate)
 */
/*
We normally speak of a day by addressing a month, for example, August 30. Another
way to indicate a day is to give an order number to each day in a year. Then we could
say, for example, "242nd day of the year".
Write a program that reads a year and the number of a day in this year, and checks if
the day is the last day of a month or not.
The program must output either "true" or "false".
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int dayOfYear = sc.nextInt();

        LocalDate localDate = LocalDate.ofYearDay(year, dayOfYear);

        System.out.println(localDate.getDayOfMonth() == 31);
    }
}