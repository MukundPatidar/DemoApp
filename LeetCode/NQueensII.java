package LeetCode;

import java.util.*;

public class NQueensII {
	public static void main(String[] args) {
		System.out.println(totalNQueens(1));
	}

	static int ans = 0;

	public static int totalNQueens(int n) {
		char[][] board = new char[n][n];

		for (char[] cs : board) {
			Arrays.fill(cs, '.');
		}

		helper(board, 0);

		return ans;
	}

	public static void helper(char[][] board, int col) {
		if (col == board.length) {
			ans++;
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (isSafe(board, i, col)) {
				board[i][col] = 'Q';
				helper(board, col + 1);
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
