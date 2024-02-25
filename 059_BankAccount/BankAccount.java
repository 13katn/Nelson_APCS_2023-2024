public class BankAccount {
    String userName;
    String accountType;
    Double currentBalance;
    Double intrestRate;
    boolean isOverDraft;
    public BankAccount()
    {
        userName = "Rob Gronkowski";
        accountType = "checking";
        currentBalance = 100.00; // start point
        isOverDraft = false;
    }
    public BankAccount(String userName, String accontType, double currentBalance, double intrestRate, boolean isOverDraft){
      // basiclly just shirt.java and shoe 
        this.userName = userName;
        this.accountType = accountType;
        this.currentBalance= currentBalance;
        this.intrestRate=intrestRate;
        this.isOverDraft=isOverDraft;
       }
       public void checkBalance() // currents balance and shows how mich is in acc 
       {
        System.out.println("The current amount in your account is " + currentBalance);
       }

       public void updateBalance()
       {
        System.out.println("Your updateed balance is " + currentBalance);
       }
       public void applyInterest()
       {
        double newApplyInterest = (intrestRate / 100) * currentBalance; // 100 bc percent to decimal
        System.out.println("The applied interest amount for this user is " + newApplyInterest);
       }
       // if statement so it only warns if you are actually over 
       public void updateOverdraft()
       {
        if (currentBalance < 0){
          isOverDraft = true;
          System.out.println("watch out your account is overdrafted");
        }
        else{
          isOverDraft = false;
        }
      }
}