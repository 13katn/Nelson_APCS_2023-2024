// did 78-87 wiht arsema nad mckennna after school horus
class Food {
   String name;
   int typeOfFood;


   public Food(String name, int typeOfFood) {
       this.name = name;
       this.typeOfFood = typeOfFood;
   }


   public int typeOfFood() {
       return typeOfFood;
   }


   public void describe() {
       System.out.println("Name: " + name);
       System.out.println("type of food is: " + typeOfFood);
   }
}
class IceCream  {
   private String flavor;
   private boolean isMelted;


   public IceCream(String name, int typeOfFood, String flavor, boolean isMelted) {
      
       this.flavor = flavor;
       this.isMelted = isMelted;
   }


   public void displayCharacteristics() {
       System.out.println(name + " is " + flavor + " " + "of icecream.");
       System.out.println("the ice cream" + isMelted );
   }
}
class Pizza  {
   private String toppings;
   private boolean isCheesy;


   public Pizza(String name, int typeOfFood, String toppings, boolean isCheesy) {


       this.toppings = toppings;
       this.isCheesy = isCheesy;
   }


   public void displayToppings() {
       System.out.println("Toppings on " + name + ": " + toppings);
       System.out.println("Is it cheesy? " + (isCheesy ? "Yes" : "No"));
   }
}


/*

1/3 - Compile/Content
Good start...
1/1 - Formatting
1/1 - Comments

*/