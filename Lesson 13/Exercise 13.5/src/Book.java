public class Book {
    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book(title =" + title + ", yearOfPublishing =" + yearOfPublishing + ", authors =" + authors + ")";
    }
}
