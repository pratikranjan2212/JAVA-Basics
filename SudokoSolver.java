public class SudokoSolver {
    public boolean isValid(char board[][], int row, int col) {
        for (int i=0; i<board.length; i++) {
            if (board[row][i] == board[row][col] && i != col) {
                return false;
            }
            if (board[i][col] == board[row][col] && i != row) {
                return false;
            }
        }
        int startrow = row/3*3;
        int startcol = col/3*3;
        for (int i=startrow; i<startrow+3; i++) {
            for (int j=startcol; j<startcol+3; j++) {
                if (board[i][j] == board[row][col] && i != row && j != col) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char board[][], int row, int col) {
        if (row == board.length) {
            return true;
        }

        int newrow = 0, newcol = 0;
        if (col != board.length-1) {
            newrow = row;
            newcol = col+1;
        } else {
            newrow = row+1;
            newcol = 0;
        }
        if (board[row][col] != '.') {
            if (helper(board, newrow, newcol)) {
                return true;
            }
        } else {
            for (int i=1; i<=9; i++) {
                board[row][col] = (char)(i+'0');
                if (isValid(board, row, col)) {
                    if (helper(board, newrow, newcol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void main(char board[][]) {
        helper(board, 0, 0);
    }
}
