public class Dice{
    int numberSides;
    int currentValue;
    int random;

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
    public int roll() {
       // rand number from 1-num of sides dice has
       currentVal = random.nextInt(numberSides) + 1;
       return currentVal;
   }
}
