import java.util.Random;

class Die{
    int dots,roll;
    Random number = new Random();

    public Die(){
        int dots = number.nextInt(6)+1 ;
    }

    public void roll(){
        roll = number.nextInt(dots)+1;
    }

    public int getDots(){
        return roll;
    }

}

public class RollYourOwnDice{
    public static void main (String args[]){
        Die die = new Die();
        System.out.println("you rolleda  "+die.getDots());

    }
}