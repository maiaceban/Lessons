import java.util.*;

public class NearestNumber {
    /**
     * Find the nearest number
     * (ArrayList)
     */
    /*
    Write a program that finds out the closest integer to a given one from an array. If you
    find several integers with the same distance to the N, you should output all of them in
    the ascending order. If there are several equal numbers, output them all.
    Input: a set of integers and a number N.
    Output: some number(s) from the given array.
    Sample Input 1: 1 2 4 5         Sample Output 1: 2 4
                    3
    Sample Input 2: 1 2 3 4         Sample Output 2: 4
                    6
    Sample Input 3: 5 1 3 3 1 5     Sample Output 3: 3 3 5 5
                    4
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = readArrayList(scanner);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> result = nearestNumbers(list1, n);

        result.forEach((number) -> System.out.print(number + " "));
    }

    private static List<Integer> nearestNumbers(List<Integer> list, Integer n) {
        List<Integer> differences = new ArrayList<>();
        int smallestDifference = Integer.MAX_VALUE;
        List<Integer> nearest = new ArrayList<>();

        for (Integer number : list) {
            differences.add(Math.abs(number - n));
        }
        for (Integer elem : differences) {
            smallestDifference = elem < smallestDifference ? elem : smallestDifference;
        }

        for (int i = 0; i < differences.size(); i++) {
            if (differences.get(i) == smallestDifference) {
                nearest.add(list.get(i));
            }
        }
        Collections.sort(nearest);
        return nearest;
    }

    private static List<Integer> readArrayList(Scanner scanner) {
        List<String> list = Arrays.asList(scanner.nextLine().split("\\s+"));
        List<Integer> numbers = new ArrayList<>();
        list.forEach((elem) -> numbers.add(Integer.parseInt(elem)));

        return numbers;
    }
}
