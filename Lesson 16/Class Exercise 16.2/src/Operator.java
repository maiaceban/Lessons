import java.util.function.LongUnaryOperator;

public class Operator {
    public static LongUnaryOperator unaryOperator = x -> x += x % 2 == 0 ? 2 : 1;
}
