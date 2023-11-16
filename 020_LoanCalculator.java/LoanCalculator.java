import java.util.Scanner;

public class LoanCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double principalBalance = 0.0;
        double annualInterestRate = 0.0;
        double monthlyAnnualPayments = 0.0;
        
        System.out.println("What is  your Principal Balance ? ");
        principalBalance = scan.nextDouble();

        System.out.println("What is your Annual Interest Rate? ");
        annualInterestRate = scan.nextDouble();
    

        System.out.println("What is your Monthly Remaining Payments? ");
        monthlyAnnualPayments = scan.nextDouble();

        double monthlyInterest = principalBalance * (annualInterestRate/monthlyAnnualPayments); //have to declare double
        double monthlyPayment = principalBalance/monthlyAnnualPayments + monthlyAnnualPayments; // have to redeclare double 
        System.out.println("Your monthly Interest is " + monthlyInterest + ". And your monthly intererst is " + monthlyPayment);
        scan.close();
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/