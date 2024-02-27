public class FavoriteNumbers {
    private int[] numbers = {13, 133, 1333};
// not sure what to comment for this its pretty simple but instead of setting its index value im making the array using an intializer list
    public void printNumbers() {
        System.out.println("my Favorite Numbers in the world are:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}