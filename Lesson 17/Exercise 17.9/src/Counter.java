import java.util.List;

public class Counter {
    /**
     * Count the value occurrences (The List interface)
     */
    /*
Implement a method that takes an integer value and two lists of numbers. It must
check if the value occurs the same number of times in both sequences.
In the following input example, the first line contains the value, the second line is the
first list, the third line is another list. All numbers are separated by whitespaces.
     */
    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {

        // implement the method
        int counterList1 = 0;
        int counterList2 = 0;
        for (Integer num : list1) {
            if (num == elem) {
                counterList1++;
            }
        }
        for (Integer num : list2) {
            if (num == elem) {
                counterList2++;
            }
        }
        return counterList1 == counterList2;
    }
}