import java.util.Scanner;
public class DivisibleInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // to start im just pasting 044_LoopYourName but changing the variabel to a user input
        
        
        System.out.println("Pick word to be in the spelling bee: ");
        string choiceWord = scan.nextLine();
        scan.close 

        System.out.println(choiceWord);
        System.out.println("-" + choiceWord); // can type in as string/regualr quote the first dash with the full word
        System.out.print(choiceWord + " is spelled like ");
        for (int i= 0; i< choiceWord.length(); i++) {
            System.out.print(choiceWord.substring(i,i +1)) { // if confused watch video lesson 2023-12-05 11-42-53 at like 14 minutes in ish 
            if (i < word.length()-1) { // makes sure last - isnt added 
                System.out.println("-");
            }
            }
        }
    }
       






