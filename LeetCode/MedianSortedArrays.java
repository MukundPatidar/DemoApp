public class MedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = 0;
        double ans = 0;
        int arr[] = new int[(nums1.length + nums2.length)];

        for(int i=0; i<nums1.length; i++){
            arr[count] = nums1[i];
            count++;
        }
        for(int i=0; i<nums2.length; i++){
            arr[count] = nums2[i];
            count++;
        }

        //bubble sorting 
        for(int i = (arr.length - 1); i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0, j=(arr.length-1); (i<arr.length && j>=0);i++){
            if(i == j){
                ans = arr[i];
                break;
            } else if(i>j && j<i){
                ans = (arr[i] + arr[j]);
                ans /= 2;
                break;
            }
            j--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2)/2);;
    }
}
