public class Closet {
    public static void main(String[] args){
        Shirt shirtOne = new Shirt();
        shirtOne.selfDescription();
        shirtOne.shirtClean(); // or isClean?
        shirtOne.fold();
// order is isClean,type,brand,color
        Shirt shirtTwo = new Shirt(true, "longsleeve", "threads", "Pink");
        shirtTwo.selfDescription();
        shirtTwo.shirtClean(); 
        shirtTwo.fold();

        Shirt shirtThree = new Shirt(false, "shortsleeve", "urban outfitters", "black");
        shirtThree.selfDescription();
        shirtThree.shirtClean(); 
        shirtThree.fold();

        Shirt shirtFour= new Shirt(true, "urban", "loose", "brown");
        shirtFour.selfDescription();
        shirtFour.shirtClean(); 
        shirtFour.fold();
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/