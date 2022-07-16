import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int nrOfPizzas = scanner.nextInt();
        double price = scanner.nextDouble();
        double discountedPrice = price * 0.8;

        String receipt = """ 
                        Restaurant Java
                        "Thank you %s for visiting our restaurant.
                        "You’ve ordered %d pizzas.
                        "With the total price of: %.2f.
                        "Price with 20%% discount: %.2f.
                        """.formatted(name, nrOfPizzas, price, discountedPrice);

        String template = "Restaurant Java%n" +
                        "Thank you %s for visiting our restaurant.%n" +
                        "You’ve ordered %d pizzas.%n" +
                        "With the total price of: %.2f.%n" +
                        "Price with 20%% discount: %.2f.%n";
         String receipt2 = String.format(template, name, nrOfPizzas, price, discountedPrice);

        System.out.println(receipt);
        System.out.println(receipt2);

    }
}
