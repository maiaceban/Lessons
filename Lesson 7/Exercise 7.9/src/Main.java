public class Main {
    public static void main(String[] args) {
        /*
        Here you need to prepare a StringBuilder that produces all English letters in the
        uppercase (A-Z). All the letters should be separated by one space, but there shouldn't be
        a space after the last letter. Despite the possibility to solve this problem without a
        StringBuilderat all, we highly recommend you to use it to get more practice.
        */
        StringBuilder builder = new StringBuilder();


        String sentence = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] letter = sentence.split(" " );
        System.out.println(sentence);//prints A B C D E ...


    }
}
