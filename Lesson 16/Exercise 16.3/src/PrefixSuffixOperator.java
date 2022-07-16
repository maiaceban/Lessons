import java.util.function.UnaryOperator;

public class PrefixSuffixOperator {
    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";
    public static UnaryOperator<String> operator = argument -> PREFIX + argument.trim() + SUFFIX;// write your code here



    public static UnaryOperator<String> getOperator() {
        return operator;
    }

    public static void setOperator(UnaryOperator<String> operator) {
        PrefixSuffixOperator.operator = operator;
    }
}
