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
        annualInterestRate = scan.nextDouble();6
    

        System.out.println("What is your Monthly Remaining Payments? ");
        monthlyAnnualPayments = scan.nextDouble();

        double monthlyInterest = principalBalance * (annualInterestRate/monthlyAnnualPayments);
        double monthlyPayment = principalBalance/monthlyAnnualPayments + monthlyAnnualPayments;
        System.out.println("Your monthly Interest is " + monthlyInterest + ". And your monthly intererst is " + monthlyPayment);
        scan.close();
    }
}



