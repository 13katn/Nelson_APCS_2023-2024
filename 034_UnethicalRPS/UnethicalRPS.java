
import java.util.Random;
import java.util.Scanner;

public class UnethicalRPS {
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
            System.out.println("You lose");
        } else {
            System.out.println("You lose");
        }
// same code from my regular RPS the ONLY thing thats changed is the responses for the if/elif/else statements whihc are all now "you lose"
        rps(game, lose);
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/