public class Closet {
    public static void main(String[] args){
        Shirt shirtOne = new Shirt();
        shirtOne.selfDescription();
        shirtOne.shirtClean(); // or isClean?
        shirtOne.fold();

        Shirt shirtTwo = new Shirt("pink", "threads", "longsleeve", true);
        shirtTwo.selfDescription();
        shirtTwo.shirtClean(); // or isClean?
        shirtTwo.fold();

        Shirt shirtThree = new Shirt("black", "pacsun", "cropped", false);
        shirtThree.selfDescription();
        shirtThree.shirtClean(); // or isClean?
        shirtThree.fold();

        Shirt shirtFour= new Shirt("white", "urban", "loose", true);
        shirtFour.selfDescription();
        shirtFour.shirtClean(); // or isClean?
        shirtFour.fold();


    }
}