public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, null, 5, 6};
        String[] string1 = {"1 Str", "2 Str", "3 Str", "4 Str", "5 Str", null, "6 Str"};
        String[] string2 = {"1 Str", "2 Str", "3 Str", "4 Str", "5 Str", "6 Str"};
        System.out.println(ArrayUtils.info(ints));
        System.out.println(ArrayUtils.info(string1));
        System.out.println(ArrayUtils.info(string2));
    }
}
