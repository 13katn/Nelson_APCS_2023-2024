import java.util.ArrayList;
public class FavoriteMoviesTwo {
    public static void main(String[] args){
        ArrayList<String> fm = new ArrayList<String>();
        fm.add(new String("Eternal sunshine of the spotless mind"));
        fm.add(new String("brokeback mountain"));
        fm.add(new String("Blade Runner"));
        //for loop tp call it back
        System.out.println("my favorite movies are: "); // outside the foreloop so it only prints once 
        for (int i = 0; i < fm.size(); i++){
            System.out.println(fm.get(i)); // get not a setter becasue were not chaigning the lsit at all 
        }
    }
}
