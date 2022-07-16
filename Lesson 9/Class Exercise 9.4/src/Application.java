public class Application {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Tourist", "BlaBla Bla", 2014);
        Movie movie2 = new Movie("Harry POtter", "Empty", 2015);
//        System.out.println(movie1.year);
//        System.out.println(movie2.title);
        printMovie(movie1);
        printMovie(movie2);
    }
    public static void printMovie(Movie movie) {
        System.out.println("Movie: " + movie.title + " has description \"" + movie.desc + "\" is from " + movie.year);
    }
}
