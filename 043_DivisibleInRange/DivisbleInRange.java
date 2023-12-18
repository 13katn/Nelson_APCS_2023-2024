import java.util.Scanner;
public class DivisbleRange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numberStart = 0;
        System.out.println("Pick a random interger for your range to begin: ");
        numberStart = scan.nextInt();

        int numberEnd = 0; 
        System.out.println("Pick an interger for your chsoen range to end at: ");
        numberEnd = scan.nextInt();


        

        scan.close();
    }
}

