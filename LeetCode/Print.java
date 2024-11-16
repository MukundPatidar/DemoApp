package LeetCode;

public class Print {
	public static void print2DArray(int[][] matrix){
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
