public class FavoriteMovies {
    private String[] movies = new String[3];
// this sets up its index value which is why its different then the others (numbers books and movies) beause its not in the list like the other ones 
    public FavoriteMovies() {
        movies[0] = "Eternal Sunshine of the Spotless Mind"; 
        movies[1] = "Brokeback Mountain";
        movies[2] = "Blade Runner(the new one tho which is wierd ik)";
    }
    public void printMovies() {
        System.out.println("My favorite Movies ever are:");
        for (String movie:movies) {
            System.out.println(movie);
        }
    }
    public static void main(String[] args) {}
}