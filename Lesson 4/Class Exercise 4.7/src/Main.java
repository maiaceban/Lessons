import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     * @param args
     */
    public static void main(String[] args) {
        /*
        A university has decided to open math courses and quip classrooms for 3 groups with new desks.
        The faculty agreed that only 2 students may share one table. You need to calculate the
        minimum of desks. But don't forget that each group will sit in its own classroom!
        The program receives the input of the three non-negative integers:
        the number od students in each of the three groups (the numbers is not bigger than 1000)
        Sample Input 1: 20 21 22          Sample Output 1: 32
        Sample Input 2: 16 18 20          Sample Output 2: 27

         */
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
