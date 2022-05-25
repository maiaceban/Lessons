import java.util.Scanner;

public class Main {
    /*
Implement a function for preparing full name. The function takes two string arguments: firstName and lastName.
You need to concat them together with a space in the middle.
If an argument is null then do not add it and a space to the full name.
Sample Input 1:                    Sample Output 1:
Joseph                             Joseph Brown
Brown
Sample Input 2:                     Sample Output 2:
Joseph                              Joseph
null
     */
    public static String prepareFullName(String firstName, String lastName) { //Implement a function for preparing full name
        /* Write your code here */
        String fullName = "";

        if (lastName == null) {
            lastName = firstName;
        }

        if (firstName == null) {
            fullName = lastName;
        } else {
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;
        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;
        System.out.println(prepareFullName(firstName, lastName));
    }
}
