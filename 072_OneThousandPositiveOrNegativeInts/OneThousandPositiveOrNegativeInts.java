// so many errors but we all wroked on this togetehr and tired different ways and coukdnt get it any less than this 
import java.util.ArrayList;
public class OneThousandPositiveOrNegativeInts
  {
public ArrayList<Integer> arrnumber;//initalizes the array list
  public  OneThousandPositiveOrNegativeInts()
  {
    ArrayList<Integer> arrnumber = new ArrayList<Integer>();// declares the array list
     // arrnumber= new Arraylist<Integer>();//creates a new array list
    for (int i = 0; i < 1000000; i++) 
    {//generates random number for the array list between -1,000,000 and 1,000,000
      int num = (int) (Math.random() * 2000001) - 1000000;
      arrnumber.add(num);
    }
    }
  public ArrayList<Integer> getNumbers()
  {
    return arrnumber;
  }
  public static void main(String[] args){}
}