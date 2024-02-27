public class FavoriteBooks {
    private String[] books;

    {
        books = new String[]{"lapvona", "life of pi", "The Catcher in the Rye"};
    }

    public void printBooks() {
        System.out.println("my fave books are:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
// prints out my sentences 
public class Main {
    public static void main(String[] args) {
        FavoriteMovies favoriteMovies = new FavoriteMovies();
        favoriteMovies.printMovies();

        FavoriteNumbers favoriteNumbers = new FavoriteNumbers();
        favoriteNumbers.printNumbers();

        FavoriteTVShows favoriteTVShows = new FavoriteTVShows();
        favoriteTVShows.printTVShows();

        FavoriteBooks favoriteBooks = new FavoriteBooks();
        favoriteBooks.printBooks();
    }
}