import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        List<String> strings = new ArrayList<>();

        strings.addAll(Arrays.asList(s.split(" ")));

//        for (String str : s.split(" ")) {
//            strings.add(str);
//        }
        System.out.println(strings);

    }
}
