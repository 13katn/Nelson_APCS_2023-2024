import java.util.ArrayList;
public class FavoriteBooksTwo {
    public static void main(String[] args){
        ArrayList<String> fb = new ArrayList<String>();
        fb.add(new String("lapvona"));
        fb.add(new String("life of pi"));
        fb.add(new String("teh catcher in the rye"));
        //for loop tp call it back
        for (int i = 0; i < fb.size(); i++){
            System.out.println(" my favoite books are " + fb.get(i)); // get not a setter becasue were not chaigning the lsit at all 
        }
    }
}
