public class Main {

    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        System.out.println(uncheckedException instanceof RuntimeException);
    }
}