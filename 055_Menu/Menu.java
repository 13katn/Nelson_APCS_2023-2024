public class Menu {
    public static void main(String[] args){
        // this is just a copy of menuStatic just without the static in the methods 
      MenuItem ItemOne = new MenuItem();
      MenuItem ItemTwo = new MenuItem();
      MenuItem ItemThree = new MenuItem();
  
      
      ItemOne.name = "Mac and Cheese";
      ItemOne.description = "Pasta, cheese, milk, butter";
      ItemOne.printInfo();
  
  
      ItemTwo.name = "Corn Dog";
      ItemTwo.description = "Breading batter, wiener";
      ItemTwo.printInfo();
  
    
  
      ItemThree.name = "Oreo Cake";
      ItemThree.description = "Flour, butter, milk, eggs, vanilla, oreos";
      ItemThree.printInfo();
  
      ItemOne.printInfo();
      ItemTwo.printInfo();
    }
  }