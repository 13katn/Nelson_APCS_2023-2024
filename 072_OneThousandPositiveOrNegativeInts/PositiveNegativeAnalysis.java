import java.util.ArrayList;
public class PositiveAndNegativeAnalysis
{
  public ArrayList<Integer> arrnumber;
  public int positiveNumbers(){
      int positive = 0;
   // METHODS BELOW THAT LSIT NEG AND POS NUMBERS AND PRINT SUMS LATER 
      for (int i = 0; i < arrnumber.size(); i++)
        {
          if (arrnumber > 0)
          {
            positive++;
          }
        }
      return positive;
    }
    public int negativeNumbers(){
      int negative = 0;
      for (int i = 0; i < arrnumber.size(); i++)
        {
          if (arrnumber < 0)
          {
            negative++;
          }
        }
      return negative;
    }
    public int sumOfPositiveNumbers(){
      int sumOfPositiveNumbers = 0;
      for (int i = 0; i < arrnumber.size(); i++){
          if (arrnumber > 0){
            sumOfPositiveNumbers += arrnumber;
          }
        }
      return sumOfPositiveNumbers;
    }
    public int sumOfNegativeNumbers(){
      int sumOfNegativeNumbers = 0;
      for (int i = 0; i < arrnumber.size(); i++){
          if (arrnumber < 0){
            sumOfNegativeNumbers += arrnumber;
          }
        }
      return sumOfNegativeNumbers;
    }
    public static void main(String[] args){}
  }