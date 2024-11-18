package LeetCode;

public class SpiralMatrixII {
	public static int[][] generateMatrix(int n) {
		int matrix[][] = new int[n][n];
		int count = 1;
		int rowS = 0;
		int rowE = n - 1;
		int colS = 0;
		int colE = n - 1;

		while (rowS <= rowE && colS <= colE) {
			// From colS to colE
			for (int i = colS; i <= colE; i++) {
				matrix[rowS][i] = count++;
			}
			rowS++;

			// From rowS to rowE
			for (int i = rowS; i <= rowE; i++) {
				matrix[i][colE] = count++;
			}
			colE--;

			// if (!(rowS <= rowE && colS <= colE))
			// 	break;

			// From colE to colS
			for (int i = colE; i >= colS; i--) {
				matrix[rowE][i] = count++;
			}
			rowE--;

			// if (!(rowS <= rowE && colS <= colE))
			// 	break;

			// From rowE to rowS
			for (int i = rowE; i >= rowS; i--) {
				matrix[i][colS] = count++;
			}
			colS++;
		}

		return matrix;
	}
}
