public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, null, 5, 6};
        String[] string1 = {"1 Str", "2 Str", "3 Str", "4 Str", "5 Str", null, "6 Str"};
        String[] string2 = {"1 Str", "2 Str", "3 Str", "4 Str", "5 Str", "6 Str"};


        Integer[] reverse = ArrayUtils.reverse(ints);
        String[] reverse2 = ArrayUtils.reverse(string1);
        String[] reverse3 = ArrayUtils.reverse(string2);

        System.out.println(ArrayUtils.info(reverse));
        System.out.println(ArrayUtils.info(reverse2));
        System.out.println(ArrayUtils.info(reverse3));

    }
}
