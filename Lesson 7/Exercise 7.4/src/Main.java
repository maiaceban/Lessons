import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initialDate = scanner.nextLine();

        String[] split = initialDate.split("-");

        String year = split[0];
        String month = split[1];
        String day = split[2];

        String resultDate = month +"/" + day+ "/" + year;
        System.out.println(resultDate);
    }
}
