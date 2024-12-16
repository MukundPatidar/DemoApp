package LeetCode;

import java.util.Arrays;

public class SumofEvenNumbersAfterQueries {
	public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
		int[] ans = new int[queries.length];
		int i = 0;
		int sum = 0;

		for (int num : nums) {
			if (num % 2 == 0)
				sum += num;
		}
		System.out.println("nums is: " + Arrays.toString(nums));
		System.out.println("Sum is: " + sum);

		for (int[] q : queries) {
			System.out.println("q is: " + Arrays.toString(q));

			if (nums[q[1]] + q[0] % 2 == 0) {
				System.out.println("event after adding");
				if (nums[q[1]] % 2 == 0) {
					System.out.println("event before adding");
					sum += q[0];
					nums[q[1]] += q[0];
					ans[i] = sum;
					i++;
				} else {
					System.out.println("not event before adding");
					nums[q[1]] += q[0];
					sum += nums[q[1]];
					ans[i] = sum;
					i++;
				}
				
			} else {
				System.out.println("not event after adding");
				
				if (nums[q[1]] % 2 == 0) {
					System.out.println("event before adding");
					sum -= nums[q[1]];
					nums[q[1]] += q[0];
					ans[i] = sum;
					i++;
				} else {
					System.out.println("not event before adding");
					nums[q[1]] += q[0];
					ans[i] = sum;
					i++;
				}

			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[][] queries = {
				{ 1, 0 },
				{ -3, 1 },
				{ -4, 0 },
				{ 2, 3 }
		};

		System.out.println(Arrays.toString(sumEvenAfterQueries(nums, queries)));
	}
}
