public class TierList {
    public static void main(String[] args) {
       
        String[][] numberTier = {// ranking the top 25 numbers in the first 25 numbers
            {"Tier one of numbers:", "13","9","4", "7"},
            {"Tier two of numbers:","8", "3"," 18","21"},
            {"tier three of numbers","12","11","5", "14"},
            {"tier four of numbers","1","2", "4", "17"},
        };
        // used 2 d array of strings as example repo
        System.out.print("the teir list of numbers is ");
        //For Each 2D printing
        for(int row = 0; row < numberTier.length; row++) {

            for(int column = 0; column < numberTier[row].length; column++) {
                System.out.print(numberTier[row][column] + " " + "," + " ");}
            System.out.println();
            System.out.println(); // one for column one for row 
        }
    }
}