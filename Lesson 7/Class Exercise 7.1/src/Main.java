public class Main {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        String d = new String("Java");

        System.out.println(a==b); // true
        System.out.println(a==c); // false
        System.out.println(c==d); // false


        // se compara litera cu litera
        System.out.println(a.equals(b)); //true
        System.out.println(a.equals(c)); //true
        System.out.println(c.equals(d)); //true
    }
}
