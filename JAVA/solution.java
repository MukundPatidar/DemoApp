public class solution {
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                if(i == j){
                    continue;
                }
                if((nums[i] + nums[j]) == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        System.out.println(twoSum(arr, 9));
    }
}