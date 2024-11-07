package LeetCode;

import java.util.*;

public class SpiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<>();
		int rowS = 0;
		int rowE = matrix.length - 1;
		int colS = 0;
		int colE = matrix[0].length - 1;

		while (rowS <= rowE && colS <= colE) {
			// From colS to colE
			for (int i = colS; i <= colE; i++) {
				ans.add(matrix[rowS][i]);
			}
			rowS++;

			if (!(rowS <= rowE && colS <= colE)) break;

			// From rowS to rowE
			for (int i = rowS; i <= rowE; i++) {
				ans.add(matrix[i][colE]);
			}
			colE--;

			if (!(rowS <= rowE && colS <= colE)) break;

			// From colE to colS
			for (int i = colE; i >= colS; i--) {
				ans.add(matrix[rowE][i]);
			}
			rowE--;

			if (!(rowS <= rowE && colS <= colE)) break;

			// From rowE to rowS
			for (int i = rowE; i >= rowS; i--) {
				ans.add(matrix[i][colS]);
			}
			colS++;
		}

		return ans;
	}

	public static void main(String[] args) {
		// int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		// int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr = {{7},{9},{6}};
		System.out.println(spiralOrder(arr));
	}
}
