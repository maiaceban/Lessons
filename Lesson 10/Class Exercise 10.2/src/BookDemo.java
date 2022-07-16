public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Atomic Habits");
        book.setYearOfPublishing(2019);
        book.setAuthors(new String[]{"James Clear"});
        System.out.println(book.getTitle());
        System.out.println(book.getYearOfPublishing());
        System.out.println(book.getAuthors());
    }
}
