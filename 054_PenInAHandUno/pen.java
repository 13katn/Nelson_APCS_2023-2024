public class pen{
    public class Pen {

    static String inkColor = "black";
    static String penColor = "pink";
    static int inkRemaining = 5;
   // static String words = "hello hello hello ";
    //static String cap = "on";
    //static String Type = "Clickey"; 
    static Boolean clickey = false;
    static Boolean cap = true;

    public static void main(String args[]) {}

    public static void inkRemaining(){
        System.out.println("The amount of ink remaining in this pen is " + inkRemaining + "mL.");
    }
    public static void capOff(){
        if (cap = true){
            System.out.println("This is a cap ");
        }


        System.out.println("This pen does not have a cap, it is a " + cap + " pen.");
    }
    public static void clickedOut(){
        if (clickey = false){
        System.out.println("The pen is not a clickey pen because it has a cap. ");
    }

   // public static void capOff(String newCapMode){
     //   cap = newCapMode()
    //}