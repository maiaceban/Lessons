public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getNumberOfCats());
        Cat cat1 = new Cat("Maia", 3);
        System.out.println(Cat.getNumberOfCats());
        Cat cat2 = new Cat("Europa", 13);
        System.out.println(Cat.getNumberOfCats());
        Cat cat3 = new Cat("Asia", 10);
        System.out.println(Cat.getNumberOfCats());
        Cat cat4 = new Cat("America", 8);
        System.out.println(Cat.getNumberOfCats());


        Cat cat5 = new Cat("America", 8);
        Cat cat6 = new Cat("America", 8);
        System.out.println(Cat.getNumberOfCats());
        System.out.println(cat3.toString());
        System.out.println(cat1.toString());
    }
}
