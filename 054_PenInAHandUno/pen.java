public class pen{
   
    static String colorOfInk = "blue";
    static String colorOfPen = "pink";
    static int inkRemaining = 5;
    static Boolean capOrClickey = true;

    public static void main(String[] args) {}

    public static void inkRemaining(){
        System.out.println("The amount of ink remaining in this pen is " + inkRemaining + " mL.");
    }

    public static void capOff(){
        System.out.println("The cap on this pen is off so you can write.");
    }

    public static void colorPen(){
        System.out.println("The color of this pen is " + colorOfPen);
    }

    public static void colorPensInk(){
        System.out.println("The color of this pen's ink is " + colorOfInk);
    }

    public static void capOrClickey(){ // cap or clickey is a boolean, this sets it so that true and false means cap or clcikey, and gives a resposne to if you can taek a cap off or not 
        if (capOrClickey = true){ // will return on based off what capOrClickey boolean is 
            System.out.println("you can use this pen because the cap is off");
        }
        else if(capOrClickey = false ){
            System.out.println("This pen is a cap pen so no, you can write with it .");
    }
    }
    public static void wordsToWrite(){
        System.out.println("this pen can write ");
    }
}


