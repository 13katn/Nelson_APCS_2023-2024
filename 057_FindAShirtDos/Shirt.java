public class FindAShirtDos{
    String shirtColor;
    String shirtType;
    String shirtBrand;
    Boolean isClean;

    public FindAShirtDos(){
        isClean = true; 
        shirtType = "V-Neck";
        shirtBrand = "Hanes";
        shirtColor = "White"; 
    }

    public FindAShirtDos(String brand){
        isClean = true;
        shirtType = "V-Neck";
        this.shirtBrand = shirtBrand;
        shirtColor = "White";
    }

    public FindAShirtDos(boolean isClean, String shirtType, String shirtBrand, String shirtColor){
        this.isClean = isClean; 
        this.shirtType = shirtType;
        this.shirtBrand = shirtBrand;
        this.shirtColor = shirtColor; 
    }
    public static void main(String[] args) {}
    
    public void selfDescription() {
        System.out.println("This shirt is a" + shirtColor + " " + shirtBrand + " " + shirtType + " that is clean");
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