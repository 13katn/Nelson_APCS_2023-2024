public class GasPriceTracker{
    private String gasName;
    private double gasPrice;
    public GasPriceTracker(String name, double price) {
        this.gasName = gasName;
        this.gasPrice = gasPrice;
    }
    public String getGasName(){ // getters
        return this.gasName // returns the kind of gas yoyr getting 
    }
    public void setGasName(){ // setters 
        this.gasName = newGasName
    }
    public double getGasPrice(){ // getters
        return this.gasPrice
    }
    public void setGasPrice(double newGasPrice){
        this.gasPrice = newGasPrice
    }
    public void gasNameAndPrice() // prints out orignal price 
    {
        System.out.println("Gas name is " + gasName);
        System.out.println("Gas price is " + gasPrice);
    }
    public void gasWentUpTenCent(double newGasPrice) // sets up the new gas price after teh ten cents added 
    {
        System.out.println("The gas just went up ten cents, it is now " + (newGasPrice + gasPrice));
    }
}
