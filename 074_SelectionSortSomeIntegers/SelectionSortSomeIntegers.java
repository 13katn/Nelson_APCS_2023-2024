import java.util.Scanner;
import java.util.Random;
public class RandomIntegersSort {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
      
       System.out.print("Enter the number of random integers to generate: ");
       int numIntegers = scanner.nextInt();
      
  
       int[] randomIntegers = new int[numIntegers];
       for (int i = 0; i < numIntegers; i++) { // rand num 1-10000
           randomIntegers[i] = random.nextInt(1000) + 1;
       }
      
       // rand ints
       System.out.print("heres the random Integers selected: ");
       for (int num : randomIntegers) {
           System.out.print(num + " ");
       }
       System.out.println();
       // Sorted ramd ints
       selectionSort(randomIntegers);
       System.out.print("Sorted Integers: ");
       for (int num : randomIntegers) {
           System.out.print(num + " ");
       }
   }
//method for selection sort
   public static void selectionSort(int[] arr) {
   // bellow just loops through until finds corect
       for (int i = 0; i < arr.length - 1; i++) {
           int minIndex = i;
           for (int j = i + 1; j < arr.length; j++) {
               // Compare to find smallest like the video
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
       }
   }
}
