public class Class {
    public static void main(String[] args) {

        Parent p1 = new Parent1();
//        p1.message();
        Parent p2 = new Parent2();
//        p2.message();

        Parent[] parents = {p1, p2};

        for (Parent parent : parents){
            parent.message();
        }
    }
}
