public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (Secret e : Secret.values()) {
            if (e.name().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
