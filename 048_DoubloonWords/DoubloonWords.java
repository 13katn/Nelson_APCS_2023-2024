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
                    count++;
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