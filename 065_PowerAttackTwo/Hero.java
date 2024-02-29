// public class Hero
// {
//     public static void main(String[] args)
//     {
//     String heroName= "Finn the human";
//     int heroHealth = 10;
//     int heroArmorClass= 5;
//     int weaponDamage= (int)((Math.random()*(6-4+1))+ 4);
//     }
// }
public class Hero {
    String heroName;
    int heroHealth;
    int heroArmorClass;
    int heroWeaponDamage;
    public Hero()
    {
        heroName = "Finn the human";
        heroHealth = 10;
        heroArmorClass = 10; 
        heroWeaponDamage = (int)((Math.random()*(6-4+1))+ 4);
    }
    public Hero(String heroName, int heroHealth, int heroArmorClass, int heroWeaponDamage){
        this.heroName = heroName;
        this.heroHealth = heroHealth;
        this.heroArmorClass= heroArmorClass;
        this.heroWeaponDamage=heroWeaponDamage;
       }
       public void checkHeroHealth()
       {
        if (monsterWeaponDamage - heroArmorClass <= 0){
          System.out.println("Finn has been hit and his shields are gone! His current health is " + monsterWeaponDamage - heroArmorClass- heroHealth);
        }
        else{
          System.out.println("Finn has taken a hit, but his shields are still up with " + monsterWeaponDamage - heroArmorClass + " health points");
        }
      }
    }