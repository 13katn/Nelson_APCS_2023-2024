public class LoopYourName
{
    public static void main(String[] args)
    {
        String MyName = "Kat";

        for(int i = 0; i < MyName.length(); i++)
        // is 0 < MyName --> yes so print out variable my name. i++ equals i (which is 0) plus one so now were at one which is the K, and so on and so forth
        // my comment is so in depth becuase i wathced the video and i understand it now but feel like id forget if i came back t this in a month 
        {
            System.out.println("My name is: ");
            System.out.println(MyName.substring(i,i+1));
        }
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/