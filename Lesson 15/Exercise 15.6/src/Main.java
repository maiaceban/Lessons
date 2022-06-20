public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, null, 5, 6};

        System.out.println(ArrayUtils.hasNull(ints));

        String[] strings = {"1 String", "2 String", "3 String", "4 String","5 String", null, "6 String"};

        System.out.println(ArrayUtils.hasNull(strings));

        String[] strings1 = {"1 String", "2 String", "3 String", "4 String","5 String", "6 String"};

        System.out.println(ArrayUtils.hasNull(strings1));
    }
}
