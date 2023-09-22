public class RefactorATableOfVariables
{
    public static void main(String[] args)  
    {
        int rowOneColumnOne = 1;
        int rowTwoColumnOne = 2;
        int rowThreeColumnOne = 3;
        int rowFourColumnOne = 4;

        // RESULT OF THE FIRST COLUMN IN YELLOW:
        int rowOneColumnTwo = rowOneColumnOne * rowOneColumnOne;
        int rowTwoColumnTwo = rowTwoColumnOne * rowTwoColumnOne;
        int rowThreeColumnTwo = rowThreeColumnOne * rowThreeColumnOne;
        int rowFourColumnTwo = rowFourColumnOne * rowFourColumnOne;
       
        // RESULT OF THE SECOND COLOLUMN IN YELLOW:
        int rowOneColumnThree = rowOneColumnOne * rowOneColumnOne * rowOneColumnOne;
        int rowTwoColumnThree = rowTwoColumnOne * rowTwoColumnOne * rowTwoColumnOne;
        int rowThreeColumnThree = rowThreeColumnOne * rowThreeColumnOne *  rowThreeColumnOne;
        int rowFourColumnThree = rowFourColumnOne * rowFourColumnOne * rowFourColumnOne;
       
        // anything in yellow on the chart will NOT be put in as numberin a variable it will have to use prevoius variables to do the math

        // SET A PRINTED
        System.out.println(rowOneColumnTwo);
        System.out.println(rowTwoColumnTwo);
        System.out.println(rowThreeColumnTwo);
        System.out.println(rowFourColumnTwo);
       // end set a print BEGIN SET B PRINT:
        System.out.println(rowOneColumnThree);
        System.out.println(rowTwoColumnThree);
        System.out.println(rowThreeColumnThree);
        System.out.println(rowFourColumnThree);

    }
}
 