public class ArrayUtils<T> {
    private T array;

    public T getArray() {
        return array;
    }

    public void setArray(T array) {
        this.array = array;
    }

    public ArrayUtils(T array) {
    }

    public static int getFirst(int[] array) {
        if (array != null && array.length != 0) {
            return array[0];
        }
        return 0;
    }
}
