
import java.util.Objects;

/*Create a method called rockPaperScissors which simulates the game "rock, paper,
scissors". The method takes the input of both players (rock, paper or scissors), first
parameter from first player, second from second player.*/

public class RockPaperScissors {

    /*Rock beats scissors, paper beats rock, scissors beat paper.*/

    public void rockPaperScissors(String player1, String player2) {
        if (Objects.equals(player1, "rock") && Objects.equals(player2, "scissors")) {
            System.out.println("Player 1 wins");
        }else if (Objects.equals(player1, "paper") && Objects.equals(player2, "rock")) {
            System.out.println("Player 1 wins");
        }else if (Objects.equals(player1, "scissors") && Objects.equals(player2, "paper")) {
            System.out.println("Player 1 wins");
        }else if (Objects.equals(player1, "paper") && Objects.equals(player2, "scissors")) {
            System.out.println("Player 2 wins");
        }else if (Objects.equals(player1, "rock") && Objects.equals(player2, "paper")) {
            System.out.println("Player 2 wins");
        }else if (Objects.equals(player1, "scissors") && Objects.equals(player2, "rock")) {
            System.out.println("Player 2 wins");
        }else if (Objects.equals(player1, player2)) {
            System.out.println("TIE");
        }else {
            System.out.println("Invalid input");
        }
    }
}