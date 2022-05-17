import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();   // declaring a variable and initialize it with user input
        int sum = i;            // declaring a variable and initialize it with user input


        while (i != 0) {        // while user input is not equal with 0
            if (sum >= 1000) {  // check if sum is greater or equal with 1000
                sum -= 1000;    // if so then sum = sum - 1000;
                break;          // break the while loop
            }
            i = sc.nextInt();   // get the user input and put it into i
            sum += i;           // add user input to sum
        }
        System.out.println(sum);
    }
}
