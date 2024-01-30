public class StaticShoes {
    public static void main(String[] args){
    public static String shoeBrand;
    public static Double shoeSize;
    public static String shoeColor;

    public static void Shoes(){
        public static shoeBrand = "Nike";
        public static shoeSize = 9.5;
        public static shoeColor = "Red";
    }

    public static void Shoes(String shoeBrand){
        public static this.shoeBrand= shoeBrand;
        public static shoeSize = 9.5;
        public static shoeColor = "Red";
    }

    public static void Shoes(Double shoeSize, String shoeBrand, String ShoeColor){
        public static this.shoeBrand=shoeBrand;
        public static this.shoeColor= shoeColor;
        public static this.shoeSize= shoeSize; 
    }

    public static void main(String[] args){}
    
// in no static, it will print all the same things 
    public static void printShoe(){
        System.out.println("This shoe is a " + shoeColor + "  size " + shoeSize + " " + shoeBrand);

    }
}