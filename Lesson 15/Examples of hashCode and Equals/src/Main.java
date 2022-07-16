public class Main {
    public static void main(String[] args) {
//        Person person1 = new Person("Gabriel", "Juc", 28);
//        Person person2 = new Person("Ceban", "Maia", 26);
//
////         the equals() method
//        System.out.println(person1.equals(person2)); // false
//
////        the hasCode() method
//        System.out.println(person1.hashCode()); //250421012
//        System.out.println(person2.hashCode()); //1915318863

//        String person1 = new String("Juc Gabriel");
//        String person2 = new String("Juc Gabriel");
//        System.out.println(person1.equals(person2)); //true
//        System.out.println(person1.hashCode()); //1497617406
//        System.out.println(person2.hashCode()); //1497617406

        //Overriding equals()
        Person p1 = new Person("Gabriel", "Juc", 29);
        Person p2 = new Person("Gabriel", "Juc", 29);
        Person p3 = new Person("Maia", "Juc", 26);

        System.out.println(p1.equals(p2)); //true
        System.out.println(p2.equals(p3)); // false
        System.out.println(p3.equals(p3)); // true (reflexivity)

        //Overriding hashCode()
        /*1*/
        System.out.println(p1.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(p1.hashCode());
        /*2*/
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1.hashCode() == p2.hashCode()); //false - not ok, it must be true
        /*3*/
        System.out.println(p1.equals(p3)); //false
        System.out.println(p1.hashCode() == p3.hashCode()); //false

    }
}
