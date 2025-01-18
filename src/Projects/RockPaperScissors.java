package Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        int computerScore = 0;
        int playerScore = 0;

        System.out.println("Welcome to the Rock Paper Scissors!");

        // Get choice from user
        do {

            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid input!");
                continue;
            }

            // get random choice for the computer

            computerChoice = choices[random.nextInt(/*3*/ choices.length)];
            System.out.println("Computer choice: " + computerChoice);

            // check win conditions

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You Win!");
                playerScore++;
            } else {
                System.out.println("You Lose!");
                computerScore++;
            }
            System.out.println("Player Score: " + playerScore + "and Computer Score: " + computerScore);



            // ask to play again?
            System.out.print("Play Again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        // Goodbye message

        System.out.println("Thanks for Playing!");

    }
}