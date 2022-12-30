import java.util.Objects;

//rock beats lizard scissors
//paper beats rock spock
//scissors beat paper lizard
//spock beats scissors rock
//lizard beats spock paper


public class RockPaperSpock {

    public void rockPaperSpock(String player1, String player2) {
        if (Objects.equals(player1, "rock") && Objects.equals(player2, "scissors")) {
            System.out.println("Player 1 wins");
        }else if (Objects.equals(player1, "rock") && Objects.equals(player2, "lizard")) {
            System.out.println("Player 1 wins");


        }else if (Objects.equals(player1, "paper") && Objects.equals(player2, "rock")) {
            System.out.println("Player 1 wins");
        }else if (Objects.equals(player1, "paper") && Objects.equals(player2, "spock")) {
            System.out.println("Player 1 wins");


        }else if (Objects.equals(player1, "scissors") && Objects.equals(player2, "paper")) {
            System.out.println("Player 1 wins");
        }else if (Objects.equals(player1, "scissors") && Objects.equals(player2, "lizard")) {
            System.out.println("Player 1 wins");


        }else if (Objects.equals(player1, "spock") && Objects.equals(player2, "scissors")) {
            System.out.println("Player 1 wins");
        }else if (Objects.equals(player1, "spock") && Objects.equals(player2, "rock")) {
            System.out.println("Player 1 wins");


        }else if (Objects.equals(player1, "lizard") && Objects.equals(player2, "spock")) {
            System.out.println("Player 1 wins");
        }else if (Objects.equals(player1, "lizard") && Objects.equals(player2, "paper")) {
            System.out.println("Player 1 wins");


        }else if (Objects.equals(player1, "rock") && Objects.equals(player2, "paper")) {
            System.out.println("Player 2 wins");
        }else if (Objects.equals(player1, "rock") && Objects.equals(player2, "spock")) {
            System.out.println("Player 2 wins");


        }else if (Objects.equals(player1, "paper") && Objects.equals(player2, "scissors")) {
            System.out.println("Player 2 wins");
        }else if (Objects.equals(player1, "paper") && Objects.equals(player2, "lizard")) {
            System.out.println("Player 2 wins");



        }else if (Objects.equals(player1, "scissors") && Objects.equals(player2, "rock")) {
            System.out.println("Player 2 wins");
        }else if (Objects.equals(player1, "scissors") && Objects.equals(player2, "spock")) {
            System.out.println("Player 2 wins");


        }else if (Objects.equals(player1, "spock") && Objects.equals(player2, "paper")) {
            System.out.println("Player 2 wins");
        }else if (Objects.equals(player1, "spock") && Objects.equals(player2, "lizard")) {
            System.out.println("Player 2 wins");


        }else if (Objects.equals(player1, "lizard") && Objects.equals(player2, "rock")) {
            System.out.println("Player 2 wins");
        }else if (Objects.equals(player1, "lizard") && Objects.equals(player2, "scissors")) {
            System.out.println("Player 2 wins");


        }else if (Objects.equals(player1, player2)) {
            System.out.println("TIE");
        }else {
            System.out.println("Invalid input");
        }
    }
}
