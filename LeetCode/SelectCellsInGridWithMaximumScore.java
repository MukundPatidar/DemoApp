package LeetCode;

import java.util.*;

public class SelectCellsInGridWithMaximumScore {
	public static int maxScore(List<List<Integer>> grid) {
		for (int i = 0; i < grid.size(); i++) {
			Collections.sort(grid.get(i), Collections.reverseOrder());
		}

		int sum = 0;
		List<Integer> nums = new ArrayList<>(grid.size());
		for (int i = 0; i < grid.size(); i++) {
			for (int j = 0; j < grid.get(i).size(); j++) {
				int num = grid.get(i).get(j);
				if (!(nums.contains(num))) {
					nums.add(num);
					sum += num;
					break;
				}
			}
		}

		return sum;
	}

	// public static boolean helper(List<Integer> nums, int idx, int max) {
	// for (int i = idx; i < 0; i++) {

	// }
	// return true;
	// }

	public static void main(String[] args) {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> inlist = new ArrayList<>();
		inlist.add(1);
		inlist.add(2);
		inlist.add(3);
		grid.add(new ArrayList<>(inlist));
		inlist.clear();

		inlist.add(4);
		inlist.add(3);
		inlist.add(2);
		grid.add(new ArrayList<>(inlist));
		inlist.clear();

		inlist.add(1);
		inlist.add(1);
		inlist.add(1);
		grid.add(new ArrayList<>(inlist));
		inlist.clear();
		System.out.println(maxScore(grid));
	}
}
