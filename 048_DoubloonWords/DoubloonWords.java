import.java.util.Scanner;
public class DoubloonWords
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String wordChoice = " ";
        
        System.out.println("Pick a word to see of its a buobloon word: ");
        String wordChoice = scan.nextLine();
        int length = word.length();
        int count = 0;

        if(length > 1)
        {
            for (int i = 0; i< length - 1; i ++)
            {
                for(int j = i + 1; j< length; j ++ )
                { 
                    if(str.charAt(i) == str.charAt(j)) // i know were not supposed to use charAt yet as u sais in the videos but we could not fihure this one out with out it
                    {
                        count++;
                    }
                }
            }
        }
        // setting responses 
        if (count > 0)
        {
            System.out.println("the word you entered is not a duobloon word");
        }
        else if (length == 1 )
        {
            System.out.println("This is a doubloon word.")
        }
    }
}

/*

Missing some puncuation and doesn't compile. Can't veify that it works. The formatting is pretty rough,
but I'm going to look past that for now.

0/1 - Compiles
0/1 - Content
1/1 - Formatting
1/1 - Comments

*/