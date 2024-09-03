class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[] queens = new int[n];
        boolean[] cols = new boolean[n];
        boolean[] hills = new boolean[2 * n - 1];
        boolean[] dales = new boolean[2 * n - 1];
        backtrack(0, n, queens, solutions, cols, hills, dales);
        return solutions;
    }

    private void backtrack(int row, int n, int[] queens, List<List<String>> solutions, 
                           boolean[] cols, boolean[] hills, boolean[] dales) {
        if (row == n) {
            solutions.add(generateBoard(queens, n));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isNotUnderAttack(row, col, n, cols, hills, dales)) {
                placeQueen(row, col, queens, cols, hills, dales);
                backtrack(row + 1, n, queens, solutions, cols, hills, dales);
                removeQueen(row, col, queens, cols, hills, dales);
            }
        }
    }

    private boolean isNotUnderAttack(int row, int col, int n, 
                                     boolean[] cols, boolean[] hills, boolean[] dales) {
        return !cols[col] && !hills[row - col + n - 1] && !dales[row + col];
    }

    private void placeQueen(int row, int col, int[] queens, 
                            boolean[] cols, boolean[] hills, boolean[] dales) {
        queens[row] = col;
        cols[col] = true;
        hills[row - col + queens.length - 1] = true;
        dales[row + col] = true;
    }

    private void removeQueen(int row, int col, int[] queens, 
                             boolean[] cols, boolean[] hills, boolean[] dales) {
        queens[row] = -1;
        cols[col] = false;
        hills[row - col + queens.length - 1] = false;
        dales[row + col] = false;
    }

    private List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = '.';
            }
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}