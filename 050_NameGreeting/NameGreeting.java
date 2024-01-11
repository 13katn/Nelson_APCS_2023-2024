import java.util.Scanner;

public class NameGreeting {
    // Custom method to print the user entered name 
    public static void printGreeting(String name) {
        System.out.println("Greetings " + name + "!!!");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Whats youre name: ");
        String userName = scan.nextLine();
        printGreeting(userName); // <-- calls the method that has the scanner
        scan.close();
    }
}