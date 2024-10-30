import java.util.*;

public class SpiralMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];
		int count = 10;

		int rowS = 0;
		int rowE = 8;
		int colS = 0;
		int colE = 8;

		while (rowS <= rowE && colS <= colE) {
			// 2
			for (int i = colS; i <= colE; i++) {
				arr[rowS][i] = count;
				count++;
			}
			rowS++;

			// 3
			for (int i = rowS; i <= rowE; i++) {
				arr[i][colE] = count;
				count++;
			}
			colE--;

			// 4
			for (int i = colE; i >= colS; i--) {
				arr[rowE][i] = count;
				count++;
			}
			rowE--;

			// 5
			for (int i = rowE; i >= rowS; i--) {
				arr[i][colS] = count;
				count++;
			}
			colS++;
		}
		sc.close();

		// System.out.println(Arrays.deepToString(arr));

		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
