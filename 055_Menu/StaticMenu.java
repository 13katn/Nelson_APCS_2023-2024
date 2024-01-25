public class StaticMenu {
  public static void main(String[] args){
    StaticMenuItem ItemOne = new StaticMenuItem();
    StaticMenuItem ItemTwo = new StaticMenuItem();
    StaticMenuItem ItemThree = new StaticMenuItem();

    
    ItemOne.name = "Mac and Cheese";
    ItemOne.description = "Pasta, cheese, milk, butter";
    ItemOne.printInfo();


    ItemTwo.name = "Corn Dog";
    ItemTwo.description = "Breading batter, wiener";
    ItemTwo.printInfo();

  

    ItemThree.name = "Oreo Cake";
    ItemThree.description = "Flour, butter, milk, eggs, vanilla, oreos";
    ItemThree.printInfo();

    //System.out.println("***");

    ItemOne.printInfo();
    ItemTwo.printInfo();
  }
}