import java.util.*;
class Solution {
    static int count=0;
    static ArrayList<Integer> nq=new ArrayList<>();
    public static void Nqueen(boolean[][] board, int row, String ans) {
        if (row == board.length) {
            nq.add(count++);
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isItSafeToPlaceQueen(board, row, col)) {
                board[row][col] = true;
                Nqueen(board, row + 1, ans + "[" + row + "-" + col + "]");
                board[row][col] = false;
            }
        }
    }

    public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {
        int r = row - 1;
        int c = col;
        while (r >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
        }
        r = row;
        c = col - 1;
        while (c >= 0) {
            if (board[r][c]) {
                return false;
            }
            c--;
        }
        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public int totalNQueens(int n) {
        nq.clear();
        Nqueen(new boolean[n][n], 0, "");
        return nq.size();
    }
}