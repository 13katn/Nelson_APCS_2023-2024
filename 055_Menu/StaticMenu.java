public class StaticMenu {
  public static void main(String[] args){
    StaticMenuItem ItemOne = new StaticMenuItem();
    StaticMenuItem ItemTwo = new StaticMenuItem(); // has to be named static menu item
    StaticMenuItem ItemThree = new StaticMenuItem();
// shows it yellow but it runs 
    
    ItemOne.name = "Mac and Cheese";
    ItemOne.description = "Pasta, cheese, milk, butter";
    ItemOne.printInfo();


    ItemTwo.name = "Corn Dog";
    ItemTwo.description = "Breading batter, wiener";
    ItemTwo.printInfo();

   // CREATED CLASS VARIABLES
    

    ItemThree.name = "Oreo Cake";
    ItemThree.description = "Flour, butter, milk, eggs, vanilla, oreos";
    ItemThree.printInfo();

    //System.out.println("***");

    ItemOne.printInfo();
    ItemTwo.printInfo();
  }
}