public class Main {
    /**
     * Tekwill Academy
     * Java Fundamentals
      */

    public static void main(String[] args) {
        /*
        Here you need to prepare a StringBuilder that produces all English letters in the
        uppercase (A-Z). All the letters should be separated by one space, but there shouldn't be
        a space after the last letter. Despite the possibility to solve this problem without a
        StringBuilderat all, we highly recommend you to use it to get more practice.
        */

        char c;

        StringBuilder builder = new StringBuilder();
        for (c = 'A'; c <= 'Z'; ++c)
            System.out.print(c + " ");
        System.out.println(builder);//prints A B C D E ...
    }
}
