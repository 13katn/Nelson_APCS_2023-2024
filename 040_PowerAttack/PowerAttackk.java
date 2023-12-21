public class PowerAttackk
{
    public static void main(String[] args)
    {
    int characterStrength= 3;

    int monsterHitPoints=13;
    int monsterArmorClass= 11;
    int weaponDamage= (int)((Math.random()*(6-4+1))+ 4);
    //int attackDamage=(characterStrength+attack)-monsterArmorClass;
    //int actualHit= (weaponDamage+attackDamage)-monsterHitPoints;


    while(monsterHitPoints>0)
    {
      int attack= (int)(Math.random()*10+1); 
      if(characterStrength+attack>=monsterArmorClass) // if random roll 1-10 plus three is greater than or equal to 11 you killed the monster
      {
       System.out.println("Thats a hit!");
       int attackDamage=(characterStrength+attack)-monsterArmorClass;
        // int actualHit= monsterHitPoints - (weaponDamage+attackDamage);
         monsterHitPoints = monsterHitPoints- weaponDamage;
         // no int because mosnter hit points has already been instantiated 

       System.out.println("You have damaged the monster for "+ attackDamage + " points."); 
       System.out.println("The monsters health is " + monsterHitPoints); 

       }
       else 
       {
        System.out.println("That's a miss, you rolled a " + weaponDamage + " reroll and try agian ");
      }

      if (monsterHitPoints <= 0) // this is so if you roll / reroll high enough that the mosnters health is subtracted to zero
      {
        System.out.println(" the mosnter is dead yay");
      }
    }
    }
}








// public class PowerAttackk
// {
//     public static void main(String args[])
//     // {
//     //     int dSixMax = 6;
//     //     int dSixMin = 1;
//     //     int dSixRange = dSixMax - dSixMin + 1;
//     //     int dSixRand = (int) (Math.random() * dSixRange + dSixMin + 1);

//     //     System.out.print(dSixRand);
//     int characterStrength = 3;
//     int attackNum = (int)(Math.random()*10+1);
//     int monsterArmorClass = 11;
//     int weaponDamage = (int)((Math.random()*2))+4;
//     int attackDamage = (characterStrength + attackNum) - monsterArmorClass;
//     int actualHit = (weaponDamage)
//     }
// }


      