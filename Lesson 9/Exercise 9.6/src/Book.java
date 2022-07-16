public class Book {
    /*
    Write a class named Book. It must have three fields: a string field title, an int field
yearOfPublishing, an array of strings authors and a constructor to initialize these
fields.
     */

    String title;
    int yearOfPublishing;
    String authors;

    public Book(){
        this.title = "Atomic Habits";
        this.yearOfPublishing = 2019;
        this.authors = "James Clear";
    }

}