import java.util.Scanner;
public class DoubloonWords
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a word: ");
        String word = scan.nextLine();
        String secondWord = word.toLowerCase();
        int length = secondWord.length();
        int count = 0;
        int secondCount = 0;
        scan.close();

        for(int i = 0; i <length; i++)
        {
            char letter = secondWord.charAt(i);
            for ( int j = 0; j<length; j++)
            {
                char secondLetter = secondWord.charAt(j); // this (char.at) returns the character at the specified index in a string
                if (letter == secondLetter)
                {
                    secondCount++;
                }
            }   // setting responses 
            if (count == 2)
            {
                System.out.println("This word is doubloon word");
            }
            else
            {
                System.out.println("The word is not a doubloon word sorry");
            }
        }
    }
}
// hte onl issue is if its not a doubloon word itl print out "Thisis not a boudloon" as many times as there are letters in the word.

/*

Missing some puncuation and doesn't compile. Can't veify that it works. The formatting is pretty rough,
but I'm going to look past that for now.

0/1 - Compiles
0/1 - Content
1/1 - Formatting
1/1 - Comments

*/