import java.util.Scanner;

public class DivisbleInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pick an integer for your starting number for the range: ");
        int numberStart = scan.nextInt();

        System.out.println("Pick an integer to be your ending number for the range: ");
        int numberEnd = scan.nextInt();

        System.out.println("Pick an integer you want to divide by: ");
        int divideBy = scan.nextInt();

        scan.close();

        int startCount = 0;

        System.out.println("The numbers that are divisible by " + divideBy + " between " + numberStart + " and " + numberEnd + " are:");

        for (int i = numberStart; i <= numberEnd; i++) {
            if (i % divideBy == 0) {  // i modulo == 0 becaues if its divisble by the input disivble numebr then the remainder would be == 0 so true
                System.out.println(i);
                startCount++;
            }
        }

        System.out.println("Total count: " + startCount);
    }
}
