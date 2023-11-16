import java.util.Scanner;
public class YetAgainRefactorATableOfVariables
{
    public static void main(String[] args)  
    {
        double rowOneColumnOne = 1.0;
        double rowTwoColumnOne = 2.0;
        double rowThreeColumnOne = 3.0;
        double rowFourColumnOne = 4.0;
        int expSquare = 2;
        int expCubed = 3;

        //double answer = Power(numberChosen, expSquare);

        Scanner scan = new Scanner(System.in);

        System.out.println("what row do you want to want to find from column two; answer from 1-4");
        int numberChosen = scan.nextInt();

        //System.out.println(answer);

        double answer = Math.pow(numberChosen, expSquare);
        System.out.println(answer);
        scan.close();
    }   
}
        // RESULT OF THE FIRST COLUMN IN YELLOW:
        //int rowOneColumnTwo = rowOneColumnOne * rowOneColumnOne;
        //int rowTwoColumnTwo = rowTwoColumnOne * rowTwoColumnOne;
        //int rowThreeColumnTwo = rowThreeColumnOne * rowThreeColumnOne;
        //int rowFourColumnTwo = rowFourColumnOne * rowFourColumnOne;
       
        // RESULT OF THE SECOND COLOLUMN IN YELLOW:
        //int rowOneColumnThree = rowOneColumnOne * rowOneColumnOne * rowOneColumnOne;
        //int rowTwoColumnThree = rowTwoColumnOne * rowTwoColumnOne * rowTwoColumnOne;
        //int rowThreeColumnThree = rowThreeColumnOne * rowThreeColumnOne *  rowThreeColumnOne;
        //int rowFourColumnThree = rowFourColumnOne * rowFourColumnOne * rowFourColumnOne;
       
        // anything in yellow on the chart will NOT be put in as numberin a variable it will have to use prevoius variables to do the math

        // SET A PRINTED
        //System.out.println(rowOneColumnTwo);
        //System.out.println(rowTwoColumnTwo);
        //System.out.println(rowThreeColumnTwo);
        //System.out.println(rowFourColumnTwo);
       // end set a print BEGIN SET B PRINT:
       // System.out.println(rowOneColumnThree);
       // System.out.println(rowTwoColumnThree);
       // System.out.println(rowThreeColumnThree);
       // System.out.println(rowFourColumnThree);

    }
}
 
/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/