public class UserAccount
{
    public static void main(String[] args)
    {
        BankData bankOne = new BankData();

        BankAccount usercheckingAccount = new BankAccount("bank of america","chekcing",100, 2.5,false); // will be called laterto decrsibe curretn acoount
        // name, account type, how muhc in checking b4 interest, intresest, and the boolean is for ovverdraft or not 
        checkingAccount.newBalance(50.0);
        checkingAccount.newBalance(-75.0);
        checkingAccount.applyInterest();
        checkingAccount.updateBalance(-90.0);
        checkingAccount.updateOverdraft();
// essentially just bank data 
    }
}

/*

1/3 - Compile/Content
-On the road, but not quite there yet. Still working on it?
1/1 - Formatting
1/1 - Comments

*/