public class BearCounter {
    public static void main(String[] args) {
        int numOfBears = 0;
        System.out.println("the number of bears in the forest is " + numOfBears);
        numOfBears++;
        System.out.println( "Uh oh a bear came along now there is " + numOfBears);
        numOfBears++;
        System.out.println("Oh and another there is now " + numOfBears);
        numOfBears++;
        System.out.println("well well would you look at that another bear, now there is " + numOfBears );
        numOfBears--;
        System.out.println("Wow that was alot of bears. Oh look ones levaing now there is " + numOfBears);
        numOfBears--;
        System.out.println("oh and another one " + numOfBears);
        numOfBears--; 
        System.out.println(" the last ones leaving now there is only " + numOfBears );
        // because cdde reads/updates downwards you can use the same varibale(num of bears) the whole time at it wil subtract or add from the most previus update
        
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/