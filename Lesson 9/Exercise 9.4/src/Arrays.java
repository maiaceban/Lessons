public class Arrays {
    /*
     The class Arrays includes a lot of useful methods for processing arrays. One of them is the binarySearch method.
     It allows you to quickly find the index of an element in the given ordered array.
     You just need to pass the given parameters in the same order to this method.
     In the main class get an array of 10 integers with a Scanner and one more integer to find the position of.
     Use binarySearch method to find its position in the array. Don’t use imports in this exercise.
        Sample Input 1:             Sample Output 1:
        0 1 2 3 4 5 6 7 8 9         5
        5
     */

    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        java.util.Scanner sc = new java.util.Scanner(System.in);

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();

        java.util.Arrays.sort(arr);

        int result = java.util.Arrays.binarySearch(arr, search);

        System.out.println(result);

    }
}
