package LeetCode;

import java.util.*;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                arr.add(i);
            } else {
                count++;
            }
        }

        int last = nums.length - 1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            int tamp = nums[arr.get(i)];
            nums[arr.get(i)] = nums[last];
            nums[last] = tamp;
            last--;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        System.out.println(removeElement(nums, 3));
    }
}
