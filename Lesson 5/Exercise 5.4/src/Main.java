import java.util.Scanner;

public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
     */
    public static void main(String[] args) {
        /*
        Harry Potter needs help identifying what each house means.
        Read a string representing a house and output the following:
        ● if it is "gryffindor", output "bravery";
        ● if it is "hufflepuff", output "loyalty";
        ● if it is "slytherin", output "cunning";
        ● if it is "raven claw", output "intellect";
        ● otherwise, output "not a valid house".
            Sample Input 1: gryffindor
            Sample Output 1: bravery
         */
        Scanner scanner = new Scanner(System.in);
        String house = scanner.nextLine();
        switch (house) {
            case "gryffindor" -> System.out.println("Bravery!");
            case "hufflepuff" -> System.out.println("Loyalty!");
            case "slytherin" -> System.out.println("Cunning!");
            case "raven claw" -> System.out.println("Intellect!");
            default -> System.out.println("Not a valid house");
        }
    }
}
