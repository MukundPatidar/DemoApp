public class SelectionSorting {
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

        //selection sorting 
        for(int i=0; i<a.length; i++){
            int small = i;
            for(int j=i+1; j<a.length; j++){
                if(a[small] > a[j]){
                    small = j;
                }
            }
            int temp = a[small];
            a[small] = a[i];
            a[i] = temp;
        }

        System.out.println();

        //printing sorted array
        print(a);
    }
}
