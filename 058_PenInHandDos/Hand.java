public class Hand {
    public static void main(String[] args){
        Pen penOne = new Pen();
        penOne.selfDescription();
        penOne.capOrClickey(); 
        penOne.wordsToWrite();
// order is isClean,type,brand,color
        Pen penTwo = new Pen(false, "black", "pink", 6);
        penTwo.selfDescription();
        penTwo.capOrClickey(); 
        penTwo.wordsToWrite();

        Pen penThree = new Pen(true, "brown", "orange", 8);
        penThree.selfDescription();
        penThree.capOrClickey(); 
        penThree.wordsToWrite();

        Pen penFour= new Pen(true, "green", "black", 3);
        penFour.selfDescription();
        penFour.capOrClickey(); 
        penFour.wordsToWrite();
    }
}
