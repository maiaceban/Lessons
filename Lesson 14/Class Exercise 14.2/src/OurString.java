public class OurString implements ReversedString {
    public String str;

    public OurString(String str) {
        this.str = str;
    }

    @Override
    public String reverse() {
        //        return new StringBuilder(str).reverse().toString();
        char[] chars = str.toCharArray();

        String response = "";
        for (int i = length() - 1; i >= 0; i--) {
            response += str.charAt(i);
        }
        return response;


    }

    public int length() {
        return str.length();
    }
}
