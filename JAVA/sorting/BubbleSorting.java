package sorting;
public class BubbleSorting {
    public static void print(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+"  ");
        }
    }
    public static void main(String[] args) {

        //creating unsorted array
        int a[] ={7,8,3,1,2,9,6,4,5,15,13,11,12,14,10};

        //printing unsorted array
        print(a);

        //bubble sorting 
        for(int i = (a.length - 1); i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(a[j] > a[j+1]){
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("\n");

        //printing sorted array
        print(a);
    }
}