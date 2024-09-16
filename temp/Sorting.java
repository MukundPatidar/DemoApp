import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {60,100,500,1,88,10,20,30};

        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i] > arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
