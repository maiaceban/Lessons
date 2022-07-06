import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Don't be late again (Comparing dates and time)
 */
/*
Yesterday an unfortunate thing happened. You wanted to visit a grocery store, it was
late and one by one the stores already started to close. You've decided to go to
Kwik-E-Mart to buy some doughnuts, but when you reached it, the store was already closed.
To avoid such situations, you've prepared a list of stores nearby with their closing
time. To get to any of them you need exactly 30 minutes.
Now your job is to write a program that determines which stores you will be able to
reach today if you go out at exactly 19:30.
Input data format: The first line contains a number of stores in the list. The following
lines contain information about the stores with two attributes: store name and the
closing time. They are separated by one space (a name cannot have spaces).
Output data format: Grocery stores you will be able to reach in 30 minutes. The order
of stores in the output should be the same as in the input. Each store is in a new line.
 */
public class Main {
    public static void main(String[] args) {
        LocalTime offTime = LocalTime.of(20, 0);

        Scanner scanner = new Scanner(System.in);
        int numberOfStores = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < numberOfStores; i++) {
            String token = scanner.nextLine();

            String[] arr = token.split(" ");

            LocalTime time = LocalTime.parse(arr[1].trim());

            if (time.isAfter(offTime)) {
                list.add(arr[0]);
            }
        }
        for (String store : list) {
            System.out.println(store);
        }
    }
}
//4
//Tastyday 20:30
//Food 20:00
//Zehrs 19:00
//Bonus 20:20