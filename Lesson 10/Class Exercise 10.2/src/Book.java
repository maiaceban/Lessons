public class Book {  // Create a class named book
    private String title; //a string field
    private int yearOfPublishing;// an int field
    private String[] authors; // an array of strings

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing(){
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;
    }

    public String[] getAuthors(){
        return authors;
    }
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
