package LeetCode;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int ans = 0;

        for (int i = 0; i < height.length-1; i++) {
            int next = i;
            int sum = 0;
            int count = 0;
            // System.out.println("i is "+i);

            for (int j = i + 1; j < height.length; j++) {
                if (height[i] <= height[j]) {
                    next = j;
                    // System.out.println("next is "+next);
                    break;
                }
                if(j == height.length-1){
                    height[i]--;
                    j=i;
                }
            }

            for (int j = i + 1; j < next; j++) {
                sum += height[j];
                count++;
            }

            if (i != next && next != i+1) {
                ans += (height[i] * count) - sum;
                // System.out.println("sum is "+sum);
                // System.out.println("count is "+count);
                // System.out.println("ans is "+ans);
                i = next-1;
            }
            // System.out.println("\n\n");
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
