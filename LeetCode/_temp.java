package LeetCode;

public class _temp {
	public static void spiralOrder(int[][] matrix) {
		int rowS = 0;
		int rowE = matrix.length-1;
		int colS = 0;
		int colE = matrix[0].length-1;

		while (rowS <= rowE && colS <= colE) {
			//From colS to colE
			for (int i = colS; i <= colE; i++) {
				System.out.print(matrix[rowS][i]+", ");
			}
			rowS++;

			//From rowS to rowE
			for (int i = rowS; i <= rowE; i++) {
				System.out.print(matrix[i][colE]+", ");
			}
			colE--;

			//From colE to colS
			for (int i = colE; i >= colS; i--) {
				System.out.print(matrix[rowE][i]+", ");
			}
			rowE--;

			//From rowE to rowS
			for (int i = rowE; i >= rowS; i--) {
				System.out.print(matrix[i][colS]+", ");
			}
			colS++;
		}

	}
	public static void main(String args[]) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(arr.length);
	}
}
