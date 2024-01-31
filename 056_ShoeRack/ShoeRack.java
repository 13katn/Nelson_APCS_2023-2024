public class ShoeRack {
  public static void main(String[] args){
      // this is just a copy of menuStatic just without the static in the methods 
    Shoes ShoeOne = new Shoes();
    Shoes ShoeTwo = new Shoes(); // has to be named menu item
    Shoes ShoeThree = new Shoes();

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