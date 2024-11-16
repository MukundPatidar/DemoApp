package LeetCode;

import java.util.*;

public class SetMatrixZeroes {
	public static void main(String[] args) {
		int matrix1[][] = {
				{ 1, 1, 1 },
				{ 1, 1, 1, 0 },
				{ 1, 1, 1 }
		};
		int matrix2[][] = {
				{},
				{ 0, 4, 5, 2 },
				{ 0, 3, 1, 5 }
		};

		setZeroes(matrix1);
		setZeroes(matrix2);
	}

	public static void setZeroes(int[][] matrix) {
		Print.print2DArray(matrix);

		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> col = new ArrayList<>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					row.add(i);
					col.add(j);
				}
			}
		}

		
		while (row.size() != 0 && col.size() != 0) {
			// for col
			for (int i = 0; i < matrix[row.get(0)].length; i++) {
				matrix[row.get(0)][i] = 0;
			}
			
			
			// for row
			for (int i = 0; i < matrix.length; i++) {
				if (col.get(0) < matrix[i].length) {
					matrix[i][col.get(0)] = 0;
				}
			}

			row.remove(0);
			col.remove(0);
		}

		Print.print2DArray(matrix);
	}
}