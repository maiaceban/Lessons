import java.util.Scanner;

public class Main {
    /*
    Given a method that takes a long value and returns the max value of the long type minus the given number.
    public static long getMaxMinusCurrent(long val) {
    return Long.MAX_VALUE - val;
    }
    Overload this method with two new methods. The first one should take an int and return the max value of the int type
    minus the given value.
    The second one should take a short value and return the max value of the short type minus the given value.
    For both methods, the type of result value must be the same as the type of the parameter.
        Sample Input 1:                         Sample Output 1:
        Long                                    9223372036854775797
        10
        Sample Input 2:                         Sample Output 2:
        Int                                     2147483639
        8
     */
    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE + val;
    }
    // write a method here: public static ...
    public static int getMaxMinusCurrent(int val){
        return Integer.MAX_VALUE - val;
    }

    // write a method here: public static ...
    public static short getMaxMinusCurrent(short val){
        return (short) (Short.MAX_VALUE - val);
    }

    // Do not change code below
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        switch (type) {
            case "long":
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            case "short":
                final short shortVal =
                        Short.parseShort(scanner.nextLine());

                final short shortResult = getMaxMinusCurrent(shortVal);
                System.out.println(shortResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
    }
}
