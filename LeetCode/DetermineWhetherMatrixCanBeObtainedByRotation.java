package LeetCode;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
	public static void main(String[] args) {
		int mat[][] = { { 0, 0 }, { 1, 0 } };

		int target[][] = { { 1, 0 }, { 0, 0 } };

		System.out.println(findRotation(mat, target));

	}

	public static boolean findRotation(int[][] mat, int[][] target) {
		for (int i = 0; i < 4; i++) {
			if (Arrays.deepEquals(mat, target)) {
				return true;
			}

			mat = rotate90(mat);
		}

		return false;
	}

	public static int[][] rotate90(int arr[][]) {
		int n = arr.length;
		int roteted[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				roteted[j][n - i - 1] = arr[i][j];
			}
		}

		return roteted;
	}
}
