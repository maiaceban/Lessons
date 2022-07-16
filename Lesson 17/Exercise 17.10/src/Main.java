import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* Please, do not modify code in this class */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String[] values = scanner.nextLine().split("\\s+");
        final List<Integer> list = Arrays.asList(values).stream()

                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final int subListSize = Integer.parseInt(scanner.nextLine());
        final List<List<Integer>> subLists =

                ListUtils.splitListIntoSubLists(list, subListSize);

        subLists.forEach(subList -> {

            final String representation =
                    subList.stream().map(Object::toString).collect(Collectors.joining(" "));

            System.out.println(representation);
        });
    }
}
