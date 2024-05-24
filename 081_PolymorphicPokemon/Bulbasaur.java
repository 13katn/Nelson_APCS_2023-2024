public class Bulbasaur extends Pokemon
   {


   super("Bulbasaur", 35, 55, 40, 50, 50, 90); 


   public Bulbasaur()
   {
      
         //uses super to extend the Pokeman class and add the new attributes
    
       public void thunderShock(Pokemon target) {
         System.out.println(this.name + " uses Thunder Shock against " + target.name + "!");
       }
    
       public void quickAttack(Pokemon target) {
           System.out.println(this.name + " uses Quick Attack against " + target.name + "!");
       }
    
     public void lightining(Pokemon target) {
           System.out.println(this.name + " uses lightning against " + target.name + "!");
     }
   }
}
