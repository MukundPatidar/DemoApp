package LeetCode;

public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int ans = 0;
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }

                if(count > 1){
                    for(int k =j; k<n-1; k++){
                        int temp = nums[k];
                        nums[k] = nums[k+1];
                        nums[k+1] = temp;
                    }
                    n--;
                    count--;
                    j--;
                }
            }
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        System.out.println(removeDuplicates(nums));
    }
}
