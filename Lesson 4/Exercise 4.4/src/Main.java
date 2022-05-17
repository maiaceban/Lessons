import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int up = sc.nextInt();
        int down = sc.nextInt();


        // o alta varianta:
        // double heightToClimb = height - down;
        // double climbPerDay = up - down;
        // int result = (int) MAth.ceil(heightToClimb/climbPerDay);

        int heightToClimb = height - down;
        int climbPerDay = up - down;

        // q = (x+y-1)/y;
        int result = (heightToClimb + climbPerDay - 1) / climbPerDay;

        System.out.println(result);
    }
}
