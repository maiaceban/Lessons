public abstract class IntBinaryOperation {
    protected int firstArg;
    protected int secondArg;

    protected IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}
