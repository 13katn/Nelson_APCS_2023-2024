public class FavoriteBooks {
    private String[] books = new String[]{"lapvona", "life of pi", "The Catcher in the Rye"};

    public void printBooks() {
        System.out.println("my fave books are:");
        for (String book : books) {
            System.out.println(book);
        }
    }

// prints out my sentences 

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

/*

2/3 - Compile/Content
-I'm thinking some of this formatting is because you're going back and forth between replit and VS Code?
It still needs to be cleaned up and work here.
1/1 - Formatting
1/1 - Comments

*/