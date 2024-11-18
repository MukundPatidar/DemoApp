package LeetCode;

import java.util.*;

public class NQueens {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> allComb = new ArrayList<>();
		char[][] board = new char[n][n];

		for (char[] cs : board) {
			Arrays.fill(cs, '.');
		}

		helper(board, allComb, 0);

		return allComb;
	}

	public static void helper(char[][] board, List<List<String>> allComb, int col) {
		if (col == board.length) {
			List<String> tempList = new ArrayList<>();

			for (int i = 0; i < board.length; i++) {
				tempList.add(new String(board[i]));
			}

			allComb.add(tempList);
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (isSafe(board, i, col)) {
				board[i][col] = 'Q';
				helper(board, allComb, col + 1);
				board[i][col] = '.';
			}
		}
	}

	public static boolean isSafe(char[][] board, int row, int col) {
		// row & col
		for (int i = 0; i < col; i++) {
			if (board[row][i] == 'Q') {
				return false;
			}
		}

		// upper left
		int i = row;
		for (int j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}

		// lower left
		i = row;
		for (int j = col; j >= 0 && i < board.length; i++, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}

		return true;
	}
}
