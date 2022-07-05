import java.time.LocalDate;
import java.util.Scanner;

/**
 * The first day of a month or not (LocalDate)
 */
/*
We are used to talking about days in relation to their position in a month, for
example, February 22. But as we've already mentioned, there's another way to address a
day: to give an order number to each day in a year. Then we could say, for example,
"53rd day of the year".
Write a program that reads a year and the order number of a day, and checks if this
day is the first day of a month or not.
The program must output either "true" or "false".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();

        LocalDate localDate = LocalDate.ofYearDay(year, day);

        System.out.println(localDate.getDayOfMonth() == 1);
    }
}