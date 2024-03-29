/**
 * Throw an unchecked exception (Throwing exceptions)
 */
/*
Modify the given method. It should throw an unchecked exception.
 */
public class Main {
    public static void method() {
     // write your code here
        throw new RuntimeException();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
