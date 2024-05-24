import java.util.Scanner;
public class Parrot {
   // Recursive method to repeat the phrase
   public static void repeatPhrase() {
       Scanner scanner = new Scanner(System.in);
       // etner phrase here
       System.out.print("Enter a phrase ");
       String phrase = scanner.nextLine();
       // sees if they want to keep going 
       if (phrase.equals("exit")) {
           System.out.println("Exiting program...");
            // Exit the recursion
       }
       // Repeat
       System.out.println("You entered: " + phrase);
       // Recursive call to repeat the process
       repeatPhrase();
   }
   public static void main(String[] args) {
       System.out.println("Welcome to Phrase Repeater!");
       System.out.println("Enter 'exit' at any time to end the program.");
       // Sttarts again
       repeatPhrase();
   }
}
