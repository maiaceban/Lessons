public class Cat {
    /*
    Let's count the cats! Implement a class named Cat and a static method
getNumberOfCats.
     */

    // write static and instance variables
    private String name;
    private int age;
    private static int counter = 0;

    public Cat(String name, int age) {
    // implement the constructor
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }

    }
    // do not forget to check the number of cats
    public static int getNumberOfCats() {
    // implement the static method
        return counter;
    }

    public String toString() {
        return name + " " + age;
    }
}




