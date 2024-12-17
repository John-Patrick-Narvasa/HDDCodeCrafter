package _SchoolStuff.Task.Finals;

public class _Finals2 {

    // main method
    public static void main(String[] args) {
        int[][] board = new int[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (i + j) % 2;
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}