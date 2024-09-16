public class temp {
    public static void print(int arr[][]){
        System.out.println();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void add(int matrix1[][], int matrix2[][]){
        System.out.println();
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1.length; j++){
                System.out.print(" "+(matrix1[i][j] + matrix2[i][j]));
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix1[][] = {
          {1,2,3},
          {4,5,6},
          {7,8,9}  
        };
        int matrix2[][] = {
          {9,8,7},
          {6,5,4},
          {3,2,1}  
        };

        print(matrix1);
        print(matrix2);
        add(matrix1, matrix2);

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix.length; j++){
        //         if(i <= j){
        //             int temp = matrix[i][j];
        //             matrix[i][j] = matrix[j][i];
        //             matrix[j][i] = temp;
        //         }
        //     }
        // }

        // print(matrix);
    }
}
