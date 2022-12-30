import java.util.Objects;
import java.util.Scanner;

public class CallingRockPaperSpock {
    public static void main(String[] args) {
        String answer = "";
        Scanner scanner = new Scanner((System.in));

        do {
            System.out.println("Player 1, your turn");
            String player1 = scanner.nextLine().toLowerCase();
            System.out.println("Player 2, your turn");
            String player2 = scanner.nextLine().toLowerCase();

            RockPaperSpock rockPaperSpock1 = new RockPaperSpock();
            rockPaperSpock1.rockPaperSpock(player1, player2);

            System.out.println("Do you want to play again? y/n");
            answer = scanner.nextLine().toLowerCase();
        } while (Objects.equals(answer, "y"));
    }

}
