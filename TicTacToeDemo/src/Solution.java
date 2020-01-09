
import java.util.Scanner;
public class Solution {
    private boolean results = false;
    private String xo = "x";
    private boolean xoChecker = false;

    public void ticTacToe() {
        String board[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);

        while(results != true) {
            try {
                System.out.println("Please pick a number: ");
                int turn = sc.nextInt();
                printBoard(board,turn);
                if (xoChecker == false) {
                    xoChecker = true;
                    xo = "o";
                } else {
                    xoChecker = false;
                    xo = "x";
                }

                if (checkWinner(board)) {
                    break;
                }
            } catch (Exception e) {
                ticTacToe();
            }
        }
    }

    public void printBoard(String[][] board, int turn) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(turn + "")) {
                    board[i][j] = xo;
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean checkWinner(String board[][]) {

        if(board[0][0].equals("x") && board[1][1].equals("x") && board[2][2].equals("x")
                || board[0][0].equals("x") && board[0][1].equals("x") && board[0][2].equals("x")
                || board[1][0].equals("x") && board[1][1].equals("x") && board[1][2].equals("x")
                || board[2][0].equals("x") && board[2][1].equals("x") && board[2][2].equals("x")
                || board[0][0].equals("x") && board[1][0].equals("x") && board[2][0].equals("x")
                || board[0][1].equals("x") && board[1][1].equals("x") && board[2][1].equals("x")
                || board[0][2].equals("x") && board[1][2].equals("x") && board[2][2].equals("x")
                || board[0][2].equals("x") && board[1][1].equals("x") && board[2][0].equals("x")) {
            System.out.println("Player 1 Wins!!");
            results = true;
        } else if(board[0][0].equals("o") && board[1][1].equals("o") && board[2][2].equals("o")
                || board[0][0].equals("o") && board[0][1].equals("o") && board[0][2].equals("o")
                || board[1][0].equals("o") && board[1][1].equals("o") && board[1][2].equals("o")
                || board[2][0].equals("o") && board[2][1].equals("o") && board[2][2].equals("o")
                || board[0][0].equals("o") && board[1][0].equals("o") && board[2][0].equals("o")
                || board[0][1].equals("o") && board[1][1].equals("o") && board[2][1].equals("o")
                || board[0][2].equals("o") && board[1][2].equals("o") && board[2][2].equals("o")
                || board[0][2].equals("o") && board[1][1].equals("o") && board[2][0].equals("o")) {
            System.out.println("Player 2 Wins!!");
            results = true;
        }
        return results;
    }

}
