// checked 
class Dice {
    int numSides;
    int currentValue;
// in constructor 
    Dice(int numSides) { // setters
        this.numSides = numSides;
        roll(); 
    }

    int getCurrentValue() { // getters 
        return currentValue;
    }
    public void int roll() { //method 
        currentValue = (int) (Math.random() * numSides) + 1; // updated current val 
    }
    public static void main(String[]args){}
}