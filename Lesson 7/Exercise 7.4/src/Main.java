import java.util.Scanner;
/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        /*
        Write a program that takes a date string formatted as YYYY-MM-DD as input, then
        converts and outputs it as MM/DD/YYYY. For instance, the input 2007-07-21 will result in
        the following output 07/21/2007.
        Sample Input 1: 2012-09-28            Sample Output 1: 09/28/2012
         */
        Scanner scanner = new Scanner(System.in);
        String initialDate = scanner.nextLine();

        String[] split = initialDate.split("-");

        String year = split[0];
        String month = split[1];
        String day = split[2];

        String resultDate = month +"/" + day+ "/" + year;
        System.out.println(resultDate);
    }
}
