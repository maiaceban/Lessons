import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Write a method named addValueByIndex. The method should take an array of longs and add a value to the
    specified element by its index. Here are descriptions of the parameters:
    1. an array of longs;
    2. the index of an element (int);
    3. a value for adding (long).
    The method must return nothing. The following invocation should work correctly:
    addValueByIndex(array, index, value);
    Where array is an array of longs, index is an integer variable, value is a long value for adding.
        Sample Input 1:             Sample Output 1: 1 1 101 1 1
        1 1 1 1 1
        2 100
     */

    // write a method here
    public static void addValueByIndex(long[] array, int index, long value) {
        array[index] += value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))

                .mapToLong(Long::parseLong)
                .toArray();

        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }


}
