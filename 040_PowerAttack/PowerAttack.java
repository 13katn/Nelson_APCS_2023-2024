// import java.util.Random;
// import java.util.Scanner;
public class PowerAttack
{
    public static void main(String args[])
    {
        int yourCharacter = 3; 
        int yourCharacterAttack = (int)(Math.random()*10 + 1);
        int monsterStrength = 11; 
        // plus four because you add the characters strength to thier power attakck and to have a random roll 1-10 you have to add one so one plus three is four 
        int isMonsterDown = yourCharacter + yourCharacterAttack;
        int leftOver = 11 - isMonsterDown;

        PowerAttack w = new PowerAttack();
        // not sure hwo exactly to set up this part for the weapon damage doing between 4-6
        int weaponHigh = 6;
        int weaponLow = 4;
        int weaponFinal = weaponHigh - weaponLow + 4;
        int weaponFinalOne = (int) (Math.random() * weaponFinal + weaponLow);
        // int characterWeapon = w.nextInt(weaponHigh-weaponLow) + weaponLow;

    while ( );
            if (isMonsterDown > 11)
            {
                System.out.println("You rolled a " + yourCharacterAttack + " for your character strengt and a " + characterWeapon + " and killed the monster!");
            }

          else
            {
                System.out.println(" You rolled a " + yourCharacterAttack + " for the character strength attack and a " + characterWeapon + " for the weapon, the monster is still alive with " + leftOver + " health points still.");
            }
    }
}