// WORKED ON THIS with arsema ober facetime
import java.util.ArrayList;
public class AnalysisWorkBench {
    public static void main(String[] args) {

        // jsut prints below thats all 
        // in mian 
        Main main = new Main();
        ArrayList<Integer> numberList = OneThousandPositiveOrNegativeInts.getNumbers();
        PositiveandNegativeAnalysis analysis = new PositiveandNegativeAnalysis();
        System.out.println("tot pos numbers:" + analysis.positiveNumbers(numberList));
        System.out.println("tot neg numbers: " + analysis.negativeNumbers(numberList));
        System.out.println("Sum of pos: " + analysis.sumOfPositiveNumbers(numberList));
        System.out.println("Sum of neg " + analysis.sumOfNegativeNumbers(numberList));
        System.out.println("Sum of total nums " + analysis.sumAllNumbers(numberList));
    }
}