import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * How many date-time pairs match the range (Comparing dates and time)
 */
/*
Write a program that determines whether the date-time pairs belong to the specified
time range (including the earlier date-time and excluding the later) and counts the
number of such dates. The number of date-time pairs to process N should be specified
by the user. Each pair has the year-month-dayThour:minute format.
If the borders of the range are equal and a date-time is equal to them, such date-time
is not considered as belonging to the range.
Input data format: The first line contains a border of the range (either earlier or later).
The second line contains the other border of the range. The third line contains an
integer number N: a number of date-time pairs. The following N lines consist of
date-time pairs.
Output data format: The program must output an integer number: the count of
date-time pairs belonging to the given range.
Important: the first and the second input dates do not correspond to the start and
the end date. The program must determine which date is earlier.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime dateTime2 = LocalDateTime.parse(scanner.nextLine());

        if (dateTime2.isBefore(dateTime1)) {
            LocalDateTime temporary = dateTime1;
            dateTime1 = dateTime2;
            dateTime2 = temporary;
        }

        int nrOfDateTime = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < nrOfDateTime; i++) {
            LocalDateTime dateTime = LocalDateTime.parse(scanner.next());

            if ((dateTime.isAfter(dateTime1) || dateTime.equals(dateTime1)) && dateTime.isBefore(dateTime2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
//2017-12-01T00:10
//2017-12-02T00:10
//3
//2017-12-01T00:10
//2017-12-01T13:50
//2017-12-02T00:10