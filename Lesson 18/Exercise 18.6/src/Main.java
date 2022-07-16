import java.time.LocalDate;
import java.util.Scanner;

/**
 * Getting information on a day (LocalDate)
 */
/*
Write a program that reads a date from the standard input and output the following
information on it:
1) number of the day in the year;
2) the number of the day in the month.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LocalDate date = LocalDate.parse(str);

        System.out.print(date.getDayOfYear() + " ");
        System.out.print(date.getDayOfMonth());
    }
}