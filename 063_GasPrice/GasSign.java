public class GasSign {
    public static void main(String[] args){
        GasPriceTracker premium = new GasPriceTracker("premium", 2.99);
        GasPriceTracker unleaded = new GasPriceTracker("unleaded" , 2.49);
        GasPriceTracker plus = new GasPriceTracker("plus", 2.79);

// orig prices 
premium.gasNameAndPrice();
unleaded.gasNameAndPrice();
plus.gasNameAndPrice();
// new prices 
premium.gasWentUpTenCent(.10);
unleaded.gasWentUpTenCent(.10);
plus.gasWentUpTenCent(.10);
}
}
// i dont understand why this doesnt run i got it on my home computyer and soent so muhc time on this one but ill just try to take whatever poitns i can i guess but still just dont undersatnd why 