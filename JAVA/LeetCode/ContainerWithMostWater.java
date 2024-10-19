package LeetCode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, water);

            if (Math.min(height[left], height[right]) == height[left]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
