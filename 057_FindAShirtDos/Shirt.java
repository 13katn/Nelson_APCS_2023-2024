public class Shirt{
    String shirtColor;
    String shirtType;
    String shirtBrand;
    Boolean isClean;

// recreating the default-- closed parenthesis with nothign in it makes it the default-- once we add constructers it gets rid of the default 
    public Shirt(){
        isClean = true; 
        shirtType = "V-Neck";
        shirtBrand = "Hanes";
        shirtColor = "White"; 
    }

    public Shirt(String brand){
        isClean = true;
        shirtType = "V-Neck";
        this.shirtBrand = shirtBrand;
        shirtColor = "White";
    }

    public Shirt(boolean isClean, String shirtType, String shirtBrand, String shirtColor){
        this.isClean = isClean; 
        this.shirtType = shirtType;
        this.shirtBrand = shirtBrand;
        this.shirtColor = shirtColor; 
    }
    public static void main(String[] args) {}
    
    public void selfDescription() {
        System.out.println("This shirt is a" + shirtColor + " " + shirtBrand + " " + shirtType + " that is clean");
    }
    public static void fold(){
        System.out.println("the shirt is folded");
    } 
    
    public void shirtClean(){
        if(!isClean){
            isClean = true;
            System.out.println("This shirt is clean");
        }
        else{
            System.out.println("ew this shirt is dirty");
        }
        // trying this instead of using an If statement for my boolean is clean 
    }

}