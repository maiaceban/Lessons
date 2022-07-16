import java.util.*;

/**
 * The root of a number (Throwing exceptions)
 */
/*
Implement the sqrt method that counts the square root of a given number. If the
negative number is passed the method should throw the
java.lang.IllegalArgumentException with the message "Expected
non-negative number, got ?", where ? is the passed negative number.
 */
public class Main {
    public static double sqrt(double x) {// write your code here}
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got ?" + x);
        }
        return Math.sqrt(x);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        String value = new Scanner(System.in).nextLine();
        try {
            double res = sqrt(Double.parseDouble(value));
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}