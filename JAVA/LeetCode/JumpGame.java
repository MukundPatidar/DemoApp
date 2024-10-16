package LeetCode;

public class JumpGame {

    public static boolean canJump(int[] nums) {

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + nums[i]);

            if (max >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,0,4};
        int arr1[] = {2,3,1,1,4};
        System.out.println(canJump(arr));
        System.out.println(canJump(arr1));
    }
}