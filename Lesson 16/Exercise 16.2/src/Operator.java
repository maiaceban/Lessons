import java.util.function.DoubleUnaryOperator;

/**
 * Using closure write a lambda expression that calculates a × x2 + b × x + c where
 * a, b, c are context final variables. Note, the result is double. Solution format. Submit your
 * lambda expression in any valid format with ; on the end.
 * Examples: (x, y) -> x + y; (x, y) -> { return x + y; }
 */
public class Operator {
    public static int a = 10;
    public static int b = 20;
    public static int c = 30;
    public static DoubleUnaryOperator unaryOperator = x -> a * x * x + b * x + c;// Write your code here

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Operator.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Operator.b = b;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Operator.c = c;
    }

    public static DoubleUnaryOperator getUnaryOperator() {
        return unaryOperator;
    }

    public static void setUnaryOperator(DoubleUnaryOperator unaryOperator) {
        Operator.unaryOperator = unaryOperator;
    }
}
