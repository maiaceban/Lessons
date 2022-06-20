import java.util.Arrays;

public class ArrayUtils {

    //define hasNull method here
    public static <T> boolean hasNull(T[] arr) {
//       return Arrays.asList(arr).contains(null);
        for (T t : arr) {
            if (t == null) {
                return true;
            }
        }
       return false;
    }
}
