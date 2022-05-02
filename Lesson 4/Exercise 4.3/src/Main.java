public class Main {
    public static void main(String[] args) {
        int number = 476;
        int sum = 0;
        int num = number;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}