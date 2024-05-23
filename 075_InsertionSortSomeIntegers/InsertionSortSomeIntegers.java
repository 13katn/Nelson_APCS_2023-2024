import java.util.Scanner;
import java.util.Random;
public class RandomIntegersInsertionSort {
    // comments per line !!! dont forget
   public static void main(String[] args) {
       // creating scanner obviously
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       // asking user for numbers
       System.out.print("Enter the number of random integers to generate: ");
       int numIntegers = scanner.nextInt();
      
       // creates that amount of random numbers that are 1-1000
       int[] randomIntegers = new int[numIntegers];
       for (int i = 0; i < numIntegers; i++) {
           randomIntegers[i] = random.nextInt(1000) + 1;
       }
       // Shows random integers that were selected from the user input amt
       System.out.print("The integers randomely selected : ");
       for (int num : randomIntegers) {
           System.out.print(num + " ");
       }
       System.out.println();
      
       // this sorts it with the insertion sort
       insertionSort(randomIntegers);
       System.out.print(" the Sorted Integers are: ");
       for (int num : randomIntegers) {
           System.out.print(num + " ");
       }
   }
   // Insertion sort method
   public static void insertionSort(int[] arr) {
       // this basicall jsut loike Loops it through the array starting from the second slot number
       for (int i = 1; i < arr.length; i++) {
           // Current element to be positioned
           int key = arr[i];
           // Initialize the previous index
           int j = i - 1;
// key is like placeholderd variable basically so it can move them around based on how it compares below
           while (j >= 0 && arr[j] > key) {
               arr[j + 1] = arr[j]; // Shift element to the right
               j = j - 1; // Move to the previous element
           }
           // puts key at the new corredct pposition
           arr[j + 1] = key; // Insert the key into its new and correct position
       }
   }
}
