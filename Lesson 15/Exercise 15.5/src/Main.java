public class Main {
    public static void main(String[] args) {
        // initialize an instance of Holder
        Holder holder = new Holder();
        //do not change the code below
        holder.set("This is an instance of String.");

        String value = (String) holder.get();
        System.out.println(value);
    }
}
