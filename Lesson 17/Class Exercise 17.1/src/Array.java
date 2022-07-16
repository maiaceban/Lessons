import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(0);
        list.add(1);
        list.add(7);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }


}
