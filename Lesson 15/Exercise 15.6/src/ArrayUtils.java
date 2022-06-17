import java.util.Arrays;

public class ArrayUtils {

    //define hasNull method here
   public static <T> boolean hasNull(T[] a){
       return Arrays.asList(a).contains(null);
   }
}
