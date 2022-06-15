public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(4582, "$");
        Money money2 = new Money(4582, "MDL");

        System.out.println(money1.equals(money2)); //false
        System.out.println(money2.equals(money2)); //true

        System.out.println(money1.hashCode()); //250421012
        System.out.println(money2.hashCode()); //1915318863

        System.out.println(money1.hashCode() == money2.hashCode()); //false


    }
}
