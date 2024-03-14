import java.util.ArrayList;
public class FavoriteTVShowsTwo {
    public static void main(String[] args){
        ArrayList<String> ftv = new ArrayList<String>();
        ftv.add(new String("midnight gospel")); // addong numbers or like 0 , 2 ,2 is not needed fpr this 
        ftv.add(new String("adventure time"));
        ftv.add(new String("regular show or the simpsons its tied "));
        //for loop tp call it back
        for (int i = 0; i < ftv.size(); i++){
            System.out.println(" my favoite tv shows are " + ftv.get(i)); // get not a setter becasue were not chaigning the lsit at all 
        }
    }
}
