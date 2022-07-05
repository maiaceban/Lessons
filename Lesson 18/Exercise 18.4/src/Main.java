import java.time.LocalDate;
import java.util.Scanner;

/**
 * 2 weeks after (LocalDate)
 */
/*
Write a program that reads a date from the standard input and prints a date that is 2 weeks after.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LocalDate date = LocalDate.parse(str);

        System.out.println(date.plusDays(14)); // 2 weeks
    }
}