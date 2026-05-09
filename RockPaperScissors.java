package RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // ROCK PAPER SCISSORS
    public static void main(String[] args) {
        // DECLARE VARIABLES 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // GET CHOICE FROM USER
        System.out.print("Make your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock")
            && !playerChoice.equals("paper") 
            && !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice");
                continue;
        }

        // GET RANDOM CHOICE FOR THE COMPUTER
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        // CHECK WIN CONDITIONS
        if (playerChoice.equals(computerChoice)) {
            System.out.println("it's a tie!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) 
            || (playerChoice.equals("paper") && computerChoice.equals("rock")) 
            || (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
        }else{
            System.out.println("You Lose!");
        }

        // ASK TO PLAY AGAIN?
        System.out.print("play again? (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        // GOODBYE MESSAGE
        System.out.println("THANKS FOR PLAYING!");

        scanner.close();
    }
    
}
