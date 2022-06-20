public class ArrayUtils {

    public static <T> boolean hasNull(T[] arr) {
        for (T t : arr) {
            if (t == null) {
                return true;
            }
        }
        return false;
    }

    public static <S> String info(S[] arr) {
//        return Arrays.toString(arr);

        StringBuilder result = new StringBuilder("[");
        for (S s : arr) {
            result.append(s).append(", ");
        }
        result.delete(result.length() - 2, result.length())
                .append("]");
        return result.toString();
    }
}
