// worked on this with arsema emma and mckenna 
public class AccountingComputer
  {
    public static void main(String[] args)
    {
      TransactionReport transaction1= new TransactionReport();
      CashRegister cashRegister1= new CashRegister();

      transaction1.tallyTotalCost();
      transaction1.tallyTotalSalePrice();
      transaction1.tallyTotalMargin();
    }
  }