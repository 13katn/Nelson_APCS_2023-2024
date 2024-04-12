// worked on this with arsema emma and mckenna 
public class CashRegister{
    // NAME - DESCRIPTION - COST - SALE - TOTAL
    // three transactiosn below 
Transaction[] totalTransactionsOne= new Transaction[] {new Transaction("Oatmilk", "Dairy Product", 5.99, 3.99, 2.99), new Transaction("Strawberry's", "Produce", 6.99, 5.99, 1.99), new Transaction("Cookies", "Sweet Treat", 5.99, 3.99, 2.99)};
public Transaction[] getTotalTransaction(){
    return totalTransactionsOne;
}
public static void main(String[] args){}
}public class Transaction{
    String itemName;
    String itemDescription;
    double itemCost;
    double itemSalePrice;
    double itemProfit;
    double itemMargin;
} 
