
import java.util.Random;
import java.util.Scanner;

public class RPSOne {
    public static void main(String[] args) {
        String[] game = {"rock", "paper", "scissors"};
        String[] lose = {"scissors", "rock", "paper"};
        rps(game, lose);
    }

    public static void rps(String[] game, String[] lose) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a number 1-3 to play rock paper scissors, rock corresponds to 1, paper corresponds to 2, and scissors correspond to 3: ");
        int player_choice = scanner.nextInt();
        int opponent_choice = random.nextInt(3) + 1;

        System.out.println("Your opponent chose " + game[opponent_choice - 1]);

        if (game[player_choice - 1].equals(lose[opponent_choice - 1])) {
            System.out.println("You lose");
        } else if (game[opponent_choice - 1].equals(lose[player_choice - 1])) {
            System.out.println("You win!");
        } else {
            System.out.println("It's a tie");
        }

        rps(game, lose);

        /// this IS my code -- i know it looks wierd but thats because i wrote this in python last year, and just changed it myself to java !! 
    }
}

/*

Kat,

I'm going to be completely honest here. I started reading this and I went,
"What the ____!? I did not expect Kat to cheat! Seriously!?"

Then I did a few Googles. Then I came back to your code. Then I saw your comment.

Honestly? I believe you. I was thinking that we'd have a rough conversation about this after break,
but that comment and my trust in your makes me believe you 100%.

Good for you for figuring this out in this manner. Bravo. I'd look up the clap emoji, but
I'm in the middle grading and I'm fried. Imagine it.

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/