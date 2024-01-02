import java.util.Scanner;

public class BasicNestedPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter a character: ");
        String userCharacter = scan.nextLine();

        // Checking if the input character is a single character
        if (userCharacter.length() != 1) {
            System.out.println("Error: Please enter only a single character.");
            return; // had to rewatch videos AND look up bc return still confuses me but it just like finishes the method 
        }

        //rows
        System.out.println("Enter the number of rows you want the max you can do is 20: ");
        int howManyRows = scanner.nextInt();
        // columns 
        System.out.print("Enter the number of columns you want the max you can do is 20: ");
        int howManyColumns = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int x = 0; x < howManyColumns; x++) { // basicalyl making it so x = columns and i = rows 
                System.out.print(inputCharacter.substring(0, 1)); // (0,1) so it pritns the first 
            }
            System.out.println(); 
        }

        // Closing the scanner
        scan.close();
    }
}