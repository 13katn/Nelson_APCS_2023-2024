// is shirt 
public class Pen{
    String colorOfInk;
    String colorOfPen;
    int inkRemaining; // in ml 
    Boolean capOrClickey; // if true clickey if false cap 

// recreating the default-- closed parenthesis with nothign in it makes it the default-- once we add constructers it gets rid of the default 
    public Pen(){
        colorOfInk = "Blue"; 
        colorOfPen = "Black";
        inkRemaining = 5;
        capOrClickey = true; 
    }

    public Shirt(boolean capOrClickey, String inkColor, String penColor, int inkRemaining){
        this.colorOfInk = colorOfInk; 
        this.colorOfPen = colorOfPen;
        this.inkRemaining = inkRemaining;
        this.capOrClickey = capOrClickey; 

    }
    public static void main(String[] args) {}
    
    public void selfDescription() {
        System.out.println("This is a " + colorOfPen + " and the ink is " + colorOfInk + " " + " that is a cap");
    }
    public static void fold(){
        System.out.println("the shirt is folded");
    } 
    
    public void capOrClickey(){
        if(!capOrClickeyn){
            capOrClickey = true;
            System.out.println("This is a clickey pen, you cannot take the cap off");
        }
        else{
            System.out.println("the pen is clicked out ");
        }
        // trying this instead of using an If statement for my boolean is clean 
    }

}