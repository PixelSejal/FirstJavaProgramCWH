// TicTacToe.java
import java.util.*;

public class TicTacToe {

    static String[] board;
    static String turn;

    // Check if there's a winner or a draw
    static String checkWinner() {
        // Winning combinations
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // cols
                {0, 4, 8}, {2, 4, 6}             // diagonals
        };

        for (int[] combo : winConditions) {
            String line = board[combo[0]] + board[combo[1]] + board[combo[2]];
            if (line.equals("XXX")) return "X";
            if (line.equals("OOO")) return "O";
        }

        // Check for draw (if no slots contain digits)
        boolean draw = Arrays.stream(board).noneMatch(s -> s.matches("\\d"));
        return draw ? "draw" : null;
    }

    // Print the current board
    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    // Initialize/reset the board
    static void resetBoard() {
        board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
        turn = "X"; // X always starts
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to 3x3 Tic Tac Toe!");

        boolean playAgain = true;
        while (playAgain) {
            resetBoard();
            printBoard();
            System.out.println("X will play first. Enter a slot number to place X in:");

            String winner = null;
            while (winner == null) {
                int numInput;

                try {
                    numInput = in.nextInt();

                    // Check range
                    if (!(numInput >= 1 && numInput <= 9)) {
                        System.out.println("Invalid input; re-enter slot number (1-9):");
                        continue;
                    }

                    // Check if slot is free
                    if (board[numInput - 1].equals(String.valueOf(numInput))) {
                        board[numInput - 1] = turn;

                        // Toggle turn
                        turn = turn.equals("X") ? "O" : "X";

                        printBoard();
                        winner = checkWinner();

                        if (winner == null) {
                            System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
                        }
                    } else {
                        System.out.println("Slot already taken; re-enter slot number:");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input; please enter a number 1-9:");
                    in.nextLine(); // consume invalid input
                }
            }

            // Final result
            if (winner.equalsIgnoreCase("draw")) {
                System.out.println("It's a draw! Thanks for playing.");
            } else {
                System.out.println("🎉 Congratulations! " + winner + " wins!");
            }

            // Ask for replay
            System.out.println("Do you want to play again? (y/n):");
            String response = in.next();
            playAgain = response.equalsIgnoreCase("y");
        }

        System.out.println("Thanks for playing Tic Tac Toe!");
        in.close();
    }
}
