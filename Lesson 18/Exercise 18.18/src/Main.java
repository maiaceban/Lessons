import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Merging date-time instances (LocalDateTime)
 */
/*
Implement a method that takes two instances of LocalDateTime class and merges
them into one object by choosing the largest value of each component for the target
object. Consider the following components: years, months, days of months, hours,
minutes and seconds. Output the resulting LocalDateTime object.
 */
public class Main {
    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
// write your code here
        int years = Math.max(dateTime1.getYear(), dateTime2.getYear());
        int months = Math.max(dateTime1.getMonthValue(), dateTime2.getMonthValue());
        int days = Math.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth());
        int hours = Math.max(dateTime1.getHour(), dateTime2.getHour());
        int minutes = Math.max(dateTime1.getMinute(), dateTime2.getMinute());
        int seconds = Math.max(dateTime1.getSecond(), dateTime2.getSecond());
        return LocalDateTime.of(years, months, days, hours, minutes, seconds);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime =
                LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime =
                LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}
