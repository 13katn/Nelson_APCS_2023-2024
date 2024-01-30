public class Shoes {
    // public String shoeBrand;
    // public String shoeSize;
    // public String shoeColor;
    // public static void main(String[]args) {}
    String shoeBrand;
    Double shoeSize;
    String shoeColor;

    public Shoes(){
        shoeBrand = "Nike";
        shoeSize = 9.5;
        shoeColor = "Red";
    }

    public Shoes(String shoeBrand){
        this.shoeBrand= shoeBrand;
        shoeSize = 9.5;
        shoeColor = "Red";
    }

    public Shoes(Double shoeSize, String shoeBrand, String ShoeColor){
        this.shoeBrand=shoeBrand;
        this.shoeColor= shoeColor;
        this.shoeSize= shoeSize; 
    }

    public static void main(String[] args){}
    
// in no static, it will print all the same things 
    public void printShoe(){
        System.out.println("This shoe is a " + shoeColor + "  size " + shoeSize + " " + shoeBrand);

    }
}