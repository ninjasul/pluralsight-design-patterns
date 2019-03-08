package creational._03_prototype.deepcopy;

public class ItemDemo {

    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");
        movie.getKeywords().set(1, "II");
        printMovie(movie);

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");
        printMovie(anotherMovie);
    }

    private static void printMovie(Movie movie) {
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());
        System.out.println(movie.getKeywords());
    }
}