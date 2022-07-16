public class Book {  // Create a class named book
    private String title; //a string field
    private int yearOfPublishing;// an int field
    private String authors; // an array of strings


    public Book() {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    public Book(String t, int y, String a) {
        this.title = t;
        this.yearOfPublishing = y;
        this.authors = a;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String[] getAuthors() {
        return new String[]{authors};
    }

    public void setAuthors(String[] authors) {
        this.authors = String.valueOf(authors);
    }
}
