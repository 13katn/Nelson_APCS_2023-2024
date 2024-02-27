public class FavoriteTVShows {
    private String[] tvShows;
// not sure what to comment for this its pretty simple but instead of setting its index value im making the array using an intializer list
    public FavoriteTVShows() {
        tvShows = new String[]{"adventrue time", "MIDNIGHT GOSPEL", "arcane"};
    }
    public void printTVShows() {
        System.out.println("my favorite TV Shows currently are");
        for (String show : tvShows) {
            System.out.println(show);
        }
    }
}