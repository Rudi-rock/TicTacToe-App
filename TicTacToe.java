import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    static String currentPlayer;

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * Input: Scanner object
     * Output: Slot number (1-9)
     * Hint: Validation will be added in later use cases.
     */
    static int getUserSlot() {
        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();
        return slot;
    }

    static void tossAndAssignSymbols() {
        isHumanTurn = random.nextBoolean();

        if (isHumanTurn) {
            currentPlayer = "Human";
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        System.out.println("Toss Result:");
        System.out.println("First turn: " + currentPlayer);
        System.out.println("Human symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
        System.out.println();
    }

    static void initializeBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '-';
            }
        }
    }

    static void printBoard() {
        System.out.println("  0   1   2");
        for (int row = 0; row < board.length; row++) {
            System.out.println(" +---+---+---+");
            System.out.print(row + "|");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(" " + board[row][col] + " |");
            }
            System.out.println();
        }
        System.out.println(" +---+---+---+");
    }
}