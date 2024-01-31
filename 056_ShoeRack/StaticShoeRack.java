public class StaticShoeRack {
  public static void main(String[] args){
    StaticShoes ShoeOne = new StaticShoes();
    StaticShoes ShoeTwo = new StaticShoes();
    StaticShoes ShoeThree = new StaticShoes();

    //item two 
    ShoeOne.shoeBrand = "Nike hightop";
    ShoeOne.shoeColor = "white";
    ShoeOne.shoeSize = 9;
    ShoeOne.printInfo();

// item two 
    ShoeTwo.shoeBrand= "converse";
    ShoeTwo.shoeColor = "Black";
    ShoeTwo.shoeSize = 10;
    ShoeTwo.printInfo();

    // CREATED CLASS VARIABLES

    ShoeThree.shoeBrand = "adidas";
    ShoeThree.shoeColor = "white and black";
    ShoeThree.shoeSize = 10.5;
    ShoeThree.printInfo();

    // prints it below 
    ShoeOne.printInfo();
    ShoeTwo.printInfo();
    ShoeThree.printInfo();
  }
}