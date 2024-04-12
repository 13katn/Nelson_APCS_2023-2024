public Transaction(String itemName, String itemDescription, double itemCost, double itemSalePrice, double itemProfit){
        this.itemName= itemName;
        this.itemDescription= itemDescription;
        this.itemCost= itemCost;
        this.itemSalePrice= itemSalePrice;
        this.itemProfit= itemProfit;
       // this.itemMargin= (itemSalePrice- itemCost)/itemSalePrice;
    }

    public  double itemMarginCalculator(){
        itemMargin= (itemSalePrice- itemCost)/itemSalePrice;
        System.out.println("The item Margin is " + itemMargin);
        return itemMargin;
    }
    // getters and setters 
    public static void main(String[] args){}

    public double getTotalCost(){
        return itemCost;
    }
    public double getTotalSalePrice(){
        return itemSalePrice;
    }