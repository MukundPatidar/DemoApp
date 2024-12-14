package LeetCode;

import java.util.Arrays;

public class MaxPointsonaLine {
	public static int maxPoints(int[][] points) {
		int ans = 1;

		Arrays.sort(points, (a, b) -> {
			if (a[0] != b[0]) {
				return Integer.compare(a[0], b[0]);
			} else {
				return Integer.compare(a[1], b[1]);
			}
		});

		for (int i = 0; i < points.length - 1; i++) {
			int temp = helper(i, points);
			ans = Math.max(temp, ans);
			i += temp - 2;
		}

		return ans;
	}

	public static int helper(int i, int[][] points) {
		int dif = (points[i + 1][0] + points[i + 1][1]) - (points[i][0] + points[i][1]);
		int ans = 2;

		for (int j = i + 1; j < points.length - 1; j++) {
			int temp = (points[j + 1][0] + points[j + 1][1]) - (points[j][0] + points[j][1]);
			if (dif > temp) {
				break;
			} else if (dif == temp || dif % temp == 0) {
				ans++;
			} else {
				break;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[][] nums = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
		System.out.println(maxPoints(nums));//3

		int[][] nums1 = { { 1, 4 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 1 } };
		System.out.println(maxPoints(nums1));//4

		int[][] nums2 = { { 0, 0 }, { 2, 2 }, { 3, 3 } };
		System.out.println(maxPoints(nums2));//3

	}
}
