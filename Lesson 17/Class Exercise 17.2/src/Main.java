import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

/* Please, do not modify this I/O code */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));
        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
/*input: 387-968-2999 505-468-5235 739-738-3272
   505-468-5235*/

//output: 387-968-2999 739-738-3272