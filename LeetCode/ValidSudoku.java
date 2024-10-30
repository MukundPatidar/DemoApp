package LeetCode;

public class ValidSudoku {
	public static boolean isValidSudoku(char[][] board) {
        int row = 0;
		int col = 0;

		while (row < 9 && col < 9) {
			if (board[row][col] == '.') {
				if (col == 8) {
					row++;
					col = 0;
				} else {
					col++;
				}
				continue;
			}

			// checking in row & col
			for (int i = 0; i < board.length; i++) {
				if (i != col && board[row][i] == board[row][col]) {
					return false;
				}
				if (i != row && board[i][col] == board[row][col]) {
					return false;
				}
			}

			// checkimg in greed
			int colS = (col / 3) * 3;
			int rowS = (row / 3) * 3;
			for (int i = rowS; i < rowS + 3; i++) {
				for (int j = colS; j < colS + 3; j++) {
					if (!(row == i && col == j) && board[i][j] == board[row][col]) {
						return false;
					}
				}
			}

			if (col == 8) {
				row++;
				col = 0;
			} else {
				col++;
			}
		}

		return true;
    }

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(isValidSudoku(board));
	}
}
