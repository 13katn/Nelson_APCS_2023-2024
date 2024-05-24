// did with mceknana and arsema on arsemascomputer 
public class Pokemon {
   String name;
   int hp;
   int atk;
   int defense;
   int spAtk;
   int spDef;
   int speed;
    public Pokemon(String name, int hp, int atk, int defense, int spAtk, int spDef, int speed) {
       this.name = name;
       this.hp = hp;
       this.atk = atk;
       this.defense = defense;
       this.spAtk = spAtk;
       this.spDef = spDef;
       this.speed = speed;
   }
     //creates pokeman characteristics
  public void attack(Pokemon target) {
         System.out.println(this.name + " attacks " + target.name + "!");
     }
      public void defend() {
         System.out.println(this.name + " defends against the attack!");
     }
     //methods to attack opposing character.
     public static void main(String[]args){}
 }
