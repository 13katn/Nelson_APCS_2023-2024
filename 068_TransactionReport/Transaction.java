public class Transaction{
    String itemName;
    String itemDescription;
    double itemCost;
    double itemSalePrice;
    double itemProfit;
    double itemMargin;

    public Transaction(String itemName, String itemDescription, double itemCost, double itemSalePrice, double itemProfit){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCost = itemCost;
        this.itemSalePrice = itemSalePrice;
        this.itemProfit = itemProfit;
        // below calcualtes the margin 
        this.itemMargin = (itemSalePrice - itemCost)/itemSalePrice;
    }
    // uses the item margin we did the math for and plugs in the item info to find it individually 
    public void itemMarginCalculator()
    {
        System.out.println("The item margin " + itemMargin);
    }
    public static void main(String[]args){}
    public double getTotalCost()
        {
            return itemCost;
        }
        public double getTotalSalePrice()
        {
            return itemSalePrice;
        }
}