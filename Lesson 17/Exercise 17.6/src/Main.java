import java.util.*;

public class Main {
    /**
     * Greek letters
     * (The List interface)
     */
    /*
You are given a list of GreekLetter objects.
Print each element from this list on a new line.
Invoke the toString method to get the string representation of an object.
     */
    public static void main(String[] args) {
        List<GreekLetter> letterList = new ArrayList<>();
        letterList.add(new GreekLetter("Gamma", 3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha", 1));

        for (GreekLetter letter : letterList) {
            System.out.println(letter.toString()); //Invoke the toString
        }
    }

    static class GreekLetter {
        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';

        }
    }
}
