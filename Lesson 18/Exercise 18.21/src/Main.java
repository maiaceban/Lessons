import java.time.LocalTime;
import java.util.Scanner;

/**
 * The intersection of time ranges (Comparing dates and time)
 */
/*
Write a program that reads time ranges and checks if they intersect. Two ranges are
considered to have an intersection if they have at least one common point in time with
minute accuracy. The format of the time points is hour:minute. Don't use seconds, millis, nano, etc.
Input data format: Two lines containing time ranges. Each time range consists of
earlier and later time points separated by one space.
Output data format: "true" if the given intervals intersect, "false" otherwise.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime localTime1 = LocalTime.parse(scanner.next());
        LocalTime localTime2 = LocalTime.parse(scanner.next());
        LocalTime localTime3 = LocalTime.parse(scanner.next());
        LocalTime localTime4 = LocalTime.parse(scanner.next());

        boolean intersects = !localTime4.isBefore(localTime1) && !localTime3.isAfter(localTime2);
        System.out.println(intersects);
    }
}