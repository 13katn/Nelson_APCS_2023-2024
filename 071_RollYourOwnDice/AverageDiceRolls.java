import java.util.Scanner;
import java.util.ArrayList;
public class AverageDiceRolls{
    // in main method to excecute the code
    public static void main(String[]args){
        ArrayList<Integer> diceRoll = new ArrayList<Integer>();
        Dice roll = mew Dice(6);
        Scanner scasn = new Scanner(System.in);
        System.out.println("How many dcie rolls do you want:");
        int input = scan.nextInt();

        // puts dice rolls into array lsit 
        for(int i = 0; input<=i, i++){
            roll.Roll();
            diceRoll.add(roll.getCurrentValue());
            System.out.println(roll.getCurrentValue());
        }
        int total = 0;
        for(int i = 0, i<diceRoll.size(); i++)
        {
            average = total/diceRoll.sie();
        }
        System.out.println("your average is " + average + ". thanks for playing.");
        scan.close();
    }
}