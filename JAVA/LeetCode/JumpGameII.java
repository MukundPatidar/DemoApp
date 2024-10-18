package LeetCode;

public class JumpGameII {
    static int currentIndex = 0;
    public static int jump(int[] nums) {
        int count;
        int index = currentIndex;

        for(int i=currentIndex; i<nums.length; i++){
            for(int j=1; j<nums[i]; j++){
                if(j == nums.length-1){
                }
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        int arr1[] = {2,3,0,1,4};
        System.out.println(jump(arr));//2
        System.out.println(jump(arr1));//2
    }
}
