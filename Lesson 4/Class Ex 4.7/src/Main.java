import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOne = scanner.nextInt();
        int groupTwo = scanner.nextInt();
        int groupThree = scanner.nextInt();

        groupOne = groupOne / 2 + groupOne % 2;
        groupTwo = groupTwo / 2 + groupTwo % 2;
        groupThree = groupThree / 2 + groupThree % 2;

        System.out.println(groupOne + groupTwo + groupThree);

    }
}
