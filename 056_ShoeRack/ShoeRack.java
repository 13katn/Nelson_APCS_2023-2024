public class ShoeRack {
    public static void main(String[] args){
        // this is just a copy of menuStatic just without the static in the methods 
      Shoes shoeOne = new MenuItem();
      Shoes shoeTwo = new MenuItem(); // has to be named menu item
      Shoes shoeThree = new MenuItem();
  
      shoeOne.printShoe();
      shoeTwo.printShoe();
      shoeThree.printShoe();
    }
}
