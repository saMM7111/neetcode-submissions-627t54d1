class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> allSolutions = new ArrayList<>();
        placeQueens(board, 0, allSolutions);
        return allSolutions;
    }

    private void placeQueens(boolean[][] board, int row, List<List<String>> allSolutions) {
    
        if (row == board.length) {
            allSolutions.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                placeQueens(board, row + 1, allSolutions);
                board[row][col] = false; 
            }
        }
    }

    private boolean isSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }

       
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) return false;
        }

        return true;
    }

    private List<String> construct(boolean[][] board) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]){
                    row.append('Q');
                }else{
                    row.append('.');
                }
            }
            result.add(row.toString());
        }
        return result;
    }
}
