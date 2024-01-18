import java.util.Scanner;

public class AbecedarianWords {
    public static void main(String[] args) {
        // Prompt the user to enter a word
        Scanner scan = new Scanner(System.in);
        System.out.print("pick a word; ");
        String wordPicked = scan.nextLine();
        scan.close();
        boolean isAbecedarianWord = isAbecedarianWord(wordPicked); // boolean because were asnering a true or false question 

        if (isAbecedarianWord) {
            System.out.println(wordPicked + " is Abecedarian.");
        } else {
            System.out.println(wordPicked + " is not Abecedarian.");
        }
    }


    private static boolean isAbecedarianWord(String word) {
        //  the link provided in the instructiosn to this says that .compareToIgnoreCase means: Compares two strings lexicographically, ignoring case differences. This method returns an integer whose sign is that of calling compareTo with normalized versions of the strings where case differences have been eliminated by calling Character.toLowerCase(Character.toUpperCase(character)) on each character.
        word = word.compareToIgnoreCase(string);

            for (int i = 0; i < word.length() - 1; i++) {
            // Compare each pair of characters using the ignore case thing 
                if (Character.toString(word.charAt(i)).compareToIgnoreCase(Character.toString(word.charAt(i + 1))) > 0) {
                  return false; // If any pair isnt alphabetical return false
                }

        return true; 
        // this oen was so confsuign with the whole reutrn thing especaily the rretun true and return false and im not sure if this is even in the correct place for it either but ill take whatever points i can get on this one 
    }
}

/*

Missing some puncuation and doesn't compile. Can't veify that it works. The formatting is pretty rough,
but I'm going to look past that for now.

0/1 - Compiles
0/1 - Content
1/1 - Formatting
1/1 - Comments

*/