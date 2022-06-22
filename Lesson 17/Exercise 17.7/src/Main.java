import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Filtering the list
     * (The List interface)
     */
    /*
Write a program that reads the list of integer numbers separated by spaces from the
standard input and then remove all numbers with even indexes (0, 2, 4, and so on).
After that, the program should output the resulting sequence in the reverse order.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        while(scanner.hasNext()){
            inputList.add(scanner.nextInt());
        }

        for (int i = inputList.size()-1; i >= 0; i--){
            if (i % 2 == 1){
                outputList.add(inputList.get(i));
                System.out.print(inputList.get(i) + " ");
            }
        }
    }
}
