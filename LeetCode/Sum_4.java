import java.util.*;

public class Sum_4 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    double sum = (double)nums[i] + nums[j] + nums[right] + nums[left];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right- 1]) right--;

                        right--;
                        left++;
                    }else if(sum < target){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(nums, -294967296));
        int nums1[] = {1000000000,1000000000,1000000000,999999999};
        System.out.println(fourSum(nums1, -294967297));
    }
}
