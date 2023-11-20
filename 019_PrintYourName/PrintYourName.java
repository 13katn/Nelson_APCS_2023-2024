import java.util.Scanner;

public class PrintYourName{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // onyl haev to decaler this here (scan) and then can keep updating dow nteh line 
       
        System.out.println("What is  your first name? ");
        String firstName = scan.nextLine();
        System.out.println(" I like your first name " + firstName + ".");

        System.out.println("What is  your last name? ");
        String lastName = scan.nextLine();
        System.out.println("I've never heard the last name " + lastName + " before.");
        
        System.out.println(firstName + " " + lastName + " has a nice ring to it.");

        scan.close();
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/