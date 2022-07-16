import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*
Implement a method that returns an element by the specified index from a list. The
method must return an element by its regular or backward index.
In the regular order, elements have indexes 0, 1, 2, ..., n – 1. In the backward order,
the same elements have indexes -n, -n + 1, ..., -2, -1; where n is the size of a list.
If the specified index is out of bounds, the method must throw the standard
IndexOutOfBoundsException.
     */
    public static <T> T getElementByIndex(List<T> lst, int index) {
        if (index >= 0){
            return lst.get(index);
        } else {
            return lst.get(lst.size()+index);
        }
    }
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<String> values = Arrays

                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        final int index = Integer.parseInt(scanner.nextLine());
        try {
            String element = getElementByIndex(values, index);
            System.out.println(element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }
}
//input
//100 202 300 401
//0
//-1
//-2
