import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        You want to hack a website now. First, get all the available parameters that you can find in the URL.
        Then print them in the "key : value" format. If a parameter doesn't have value, print "not found".
        If you find the password (parameter pass), you should print its value after all parameters once again,
        but with a key password. If a URL does not contain parameter pass, do not print anything after the listed parameters.
        However, if pass parameter is present, its value cannot be empty. Note: the order of parameters should be the same as in the URL.
        Advice: Check examples for better understanding and carefully learn the structure of the URL.
            Sample Input:
            https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
            Sample Output:
            pass : 12345
            port : 8080
            cookie : not found
            host : localhost
            password : 12345
            Sample Input:
            https://target.com/index.html?port=8080&cookie=&host=localhost
            Sample Output:
            port : 8080
            cookie : not found
            host : localhost
         */
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String parameters = url.substring(url.indexOf('?') + 1);

        String[] keyValues = parameters.split("&");

        String output = "";
        for (String keyValue : keyValues) {
            String[] split = keyValue.split("=");
            String key = split[0];
            String value = split.length > 1 ? split[1] : "NOT FOUND";
            System.out.println(key + ": " + value);
            if (key.equals("pass")) {
                output = "password: " + value;
            }
        }
        System.out.println(output);
    }
}
