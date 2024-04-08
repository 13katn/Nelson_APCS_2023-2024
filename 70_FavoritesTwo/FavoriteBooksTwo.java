import java.util.ArrayList;
public class FavoriteBooksTwo {
    public static void main(String[] args){
        ArrayList<String> fb = new ArrayList<String>();
        fb.add(new String("lapvona"));
        fb.add(new String("life of pi"));
        fb.add(new String("the catcher in the rye"));
        //for loop tp call it back
        System.out.println("my favorite books are: "); // outside the foreloop so it only prints once 
        for (int i = 0; i < fb.size(); i++){
            System.out.println(fb.get(i)); // get not a setter becasue were not chaigning the lsit at all 
        }
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/