public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(4582, "$");
        Money money2 = new Money(4582, "$");
        Money money3 = new Money(4582, "MDL");

        System.out.println(money1.equals(money2)); //true
        System.out.println(money2.equals(money3)); //false
        System.out.println(money3.equals(money3)); //true
        System.out.println(money3.equals(null)); //false

        System.out.println(money1.hashCode()); //143039
        System.out.println(money2.hashCode()); //143039
        System.out.println(money3.hashCode()); //219184

        System.out.println(money1.hashCode() == money2.hashCode()); //true


    }
}
