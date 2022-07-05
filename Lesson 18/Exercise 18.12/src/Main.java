import java.time.LocalTime;
import java.util.Scanner;

/**
 * Some hours and minutes ago (LocalTime)
 */

/*
Write a program that reads a point in time and prints another point in time at the
specified number of hours and minutes before the given one.
Input data format: The first line contains a point in time in hours:minutes format. The
second line contains two numbers: hours and minutes separated by a space.
Output data format: The single output line should contain a point in time before the
input time in the same format.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.parse(sc.nextLine());
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        LocalTime localTime = time.minusHours(hours).minusMinutes(minutes);
        System.out.println(localTime);
    }
}