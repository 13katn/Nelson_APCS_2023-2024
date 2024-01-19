public class shirt{

    static String color = "white";
    static String brand = "Hanes";
    static Boolean isClean = true;
    static String type = "V-neck"; 

    public static void main(String args[]) {}

    public static void selfDescription(){
        System.out.println("This is a " + color + " " + type + " shirt that is made by " + brand + ".");
    }
    public static void cleanStatus(){
        if(isClean = true ){
            System.out.println("This shirt is clean.");
        }
        else if(isClean = false){
            System.out.println("This shirt is dirty.");
        }
    }
    public static void fold(){
        System.out.println("the shirt is folded");
    }
    }
