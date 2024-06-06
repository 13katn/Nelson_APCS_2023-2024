public class FactorialRecursion {
   public static int factorial(int n) {
       // calcuate factorial w recusoion method 
       if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
   public static void main(String[] args) {
       System.out.println("The factorial of 6 is " + factorial(6));
       // Calculate + print the factorial of 6
       System.out.println("The factorial of 10 is " + factorial(10));
       // Calculate + print the factorial of 10
       System.out.println("The factorial of 88 is " + factorial(88));
       // Calculate + print the factorial of 88
   }
}


/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/