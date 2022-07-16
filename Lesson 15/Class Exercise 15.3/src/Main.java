public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{11, 2, 3, 6};
        //int[] array = null;
        int first = ArrayUtils.getFirst(array);

        if (first == 0) {
            System.out.println("Null");
        } else {
            System.out.println(first);
        }
    }
}
