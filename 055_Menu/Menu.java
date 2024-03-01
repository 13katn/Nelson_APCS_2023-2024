public class Menu {
    public static void main(String[] args){
        // this is just a copy of menuStatic just without the static in the methods 
      MenuItem ItemOne = new MenuItem();
      MenuItem ItemTwo = new MenuItem(); // has to be named menu item
      MenuItem ItemThree = new MenuItem();
  
      //item two 
      ItemOne.name = "Mac and Cheese";
      ItemOne.description = "Pasta, cheese, milk, butter";
      ItemOne.printInfo();
  
  // item two 
      ItemTwo.name = "Corn Dog";
      ItemTwo.description = "Breading batter, wiener";
      ItemTwo.printInfo();
  
      // CREATED CLASS VARIABLES
    
  
      ItemThree.name = "Oreo Cake";
      ItemThree.description = "Flour, butter, milk, eggs, vanilla, oreos";
      ItemThree.printInfo();
  
      // prints it below 
      ItemOne.printInfo();
      ItemTwo.printInfo();
    }
  }

  /*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/