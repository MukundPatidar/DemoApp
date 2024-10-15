package LeetCode;

public class JumpGame {
    static int jumps = 0;
    static int index = 0;

    public boolean canJump(int[] nums) {

        if (index == nums.length - 1)
            return true;

        int curIndex = index;
        for (int i = nums[curIndex]; i >= 1; i--) {
            index += i;
            if (canJump(nums))
                return true;
            index = curIndex;
        }

        return false;
    }
}