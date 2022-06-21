/**
 * @FunctionalInterface - is used to mark functional interfaces.
 */
public interface Functional<T, R> {
    Integer apply(long val);

    R apply(T val); // single abstract method

    static void doNothingStatic() {
    }

    default void doNothingByDefault() {

    }

}
