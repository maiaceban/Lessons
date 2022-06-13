public class Main {
    public static void main(String[] args) {
        Interface instance = new Class();

        instance.instanceMethod1(); //it prints  "Class: instance method1"
        instance.instanceMethod2(); // it prints  "Class: instance method2"
        instance.defaultMethod(); // "Interface: default method. It can be overridden"
    }
}
