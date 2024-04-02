import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Dice {
    private final int numberSides; // shows number of sides of the dice 
    private int currentVal; // shows the value that the dice has currently
    private final Random random; // rand num for ROLLING the dice 

    // sets total num of sides thru constructor 
    public Dice(int numberSides) {
        this.numberSides = numberSides;
        this.random = new Random();
        roll(); // Rolls the dice after i created it in the last block
    }

// this is the current value accessable thru the getter 
    public int getCurrentVal() {
        return currentVal;
    }

// method that rolls nad returns (pretty efficiently i think?)
    public int roll() {
        // rand number from 1-num of sides dice has 
        currentVal = random.nextInt(numberSides) + 1;
        return currentVal; 
    }
}