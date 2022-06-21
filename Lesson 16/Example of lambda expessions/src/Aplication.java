public class Aplication {
    public static void main(String[] args) {
        Functional<Long, Long> square = new Functional<>() {
            @Override
            public Integer apply(long val) {
                return null;
            }

            @Override
            public Long apply(Long val) {
                return val + val;
            }
        };
        long val = square.apply(10L);

    }
}
