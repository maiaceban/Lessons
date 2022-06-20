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

    //temp = 5;

    public static <T> T[] reverse(T[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int index = arr.length - 1 - i;
            T temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }
}


