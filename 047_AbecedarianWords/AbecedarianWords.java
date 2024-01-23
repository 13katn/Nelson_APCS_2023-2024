import java.util.Scanner;
public class AbecedarianWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        
        // Check if the word is an Abecedarian word
        boolean isAbecedarian = isAbecedarianWord(word);
        
        if (isAbecedarian) {
            System.out.println(word + " is an Abecedarian word.");
        } else {
            System.out.println(word + " is not an Abecedarian word.");
        }
    }
    
    // Method checking if  word is an Abecedarian word
    public static boolean isAbecedarianWord(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (Character.toLowerCase(word.charAt(i)) > Character.toLowerCase(word.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }
}


/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/