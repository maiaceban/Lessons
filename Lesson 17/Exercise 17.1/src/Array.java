import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
    /*
    Here's a list of strings.
    ArrayList<String> nameList =
        new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
    Output each of its elements in the loop. Each element must be in a new line.
     */
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Mr.Green");
        nameList.add("Mr.Yellow");
        nameList.add("Mr.Red");
        System.out.println(nameList); //[Mr.Green, Mr.Yellow, Mr.Red]
        System.out.println(nameList.get(0)); //Mr.Green
        System.out.println(nameList.get(1)); //Mr.Yellow
        System.out.println(nameList.get(2)); //Mr.Red


    }
}