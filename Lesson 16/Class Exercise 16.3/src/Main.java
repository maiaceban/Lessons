import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();

        System.out.println(reverse.apply("String"));
        System.out.println(reverse.apply("Maia Ceban"));
    }
}
