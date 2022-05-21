import java.util.Scanner;

public class Main {
    /**
     * Java Fundamentals
     * @param args
     */
    public static void main(String[] args) {
        /*
        Read a string (name) and an integer (age) from the console and output the text
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("What is your age? ");
        int age = scanner.nextInt();


        System.out.println("Hello, my name is " + firstName + "!");
        System.out.println("I'm " + age + " years old!");

    }
}
