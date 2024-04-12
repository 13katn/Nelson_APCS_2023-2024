public class TransactionReport
{
// tallys total transcations 
        public double tallyTotalCost(Transaction[] totalTransactionsOne)
        {
            double totalCost=0;
          for (Transaction transaction : totalTransactionsOne) {
            totalCost += transaction.getTotalCost();
        }
        return totalCost;
    }
        // user details 
          public double tallyTotalSalePrice(Transaction[] totalTransactionsOne) {
              double totalSalePrice = 0;
              for (Transaction transaction : totalTransactionsOne) {
                  totalSalePrice += transaction.getTotalSalePrice();
              }
              return totalSalePrice;
              }
              
          public double tallyTotalMargin(Transaction[] totalTransactionsOne) {
              double totalMargin = 0;
              for (Transaction transaction : totalTransactionsOne) {
                  totalMargin = transaction.itemMarginCalculator();
              }
              return totalMargin;
          }
        }
