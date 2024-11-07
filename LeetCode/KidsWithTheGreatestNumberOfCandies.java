package LeetCode;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = candies[0];
		for (int i : candies) {
			if (max < i) {
				max = i;
			}
		}
		List<Boolean> ans = new ArrayList<>(candies.length);

		for (int i = 0; i < candies.length; i++) {
			if(candies[i]+extraCandies >= max){
				ans.add(true);
			} else {
				ans.add(false);
			}
		}

		return ans;
	}
}
