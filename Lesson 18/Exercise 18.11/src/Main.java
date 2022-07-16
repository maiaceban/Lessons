import java.util.Scanner;
import java.time.LocalTime;

/**
 * Return time without seconds (LocalTime)
 */
/*
Write a program that reads a point in time and outputs the same time without
seconds. Note: the input time may not contain seconds. (use LocalTime class)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.parse(sc.nextLine());

        LocalTime localTime = time.withSecond(0);
        System.out.println(localTime);

    }
}