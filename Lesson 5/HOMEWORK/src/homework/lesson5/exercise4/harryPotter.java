package homework.lesson5.exercise4;

public class harryPotter {
    public static void main(String[] args) {
        String house = "gryffindor";
        switch (house) {
            case "gryffindor" -> System.out.println("bravery");
            case "hufflepuff" -> System.out.println("loyalty");
            case "slytherin" -> System.out.println("cunning");
            case "raven claw" -> System.out.println("intellect");
            default -> System.out.println("not a valid house");
        }
    }
}
