import java.time.LocalDate;
import java.util.Scanner;

/**
 * 30 years before and after (LocalDate)
 */
/*
Write a program that reads a date from the standard input and prints two dates:
30 years before and after compared to the given date.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String str = scanner.nextLine();

        LocalDate date = LocalDate.parse(str);

        System.out.println(date.minusYears(30));
        System.out.println(date.plusYears(30));

    }
}
