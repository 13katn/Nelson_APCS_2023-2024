public class StaticShoes {
    public static void main(String[] args){}
    public static String shoeBrand;
    public static Double shoeSize;
    public static String shoeColor;
    // only put public static above becayse that is what is declaring the variable 

    public static void Shoes(){
        shoeBrand = "Nike";
        public static shoeSize = 9.5;
        public static shoeColor = "Red";
    }

    public static void Shoes(String shoeBrand){
        this.shoeBrand= shoeBrand;
        shoeSize = 9.5;
        shoeColor = "Red";
    }

    public static void Shoes(Double shoeSize, String shoeBrand, String ShoeColor){
        this.shoeBrand=shoeBrand;
        this.shoeColor= shoeColor;
        this.shoeSize= shoeSize; 
    }

    public static void main(String[] args){}
    
// in no static, it will print all the same things 
    public static void printShoe(){
        System.out.println("This shoe is a " + shoeColor + "  size " + shoeSize + " " + shoeBrand);

    }
}