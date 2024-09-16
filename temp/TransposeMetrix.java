public class TransposeMetrix {
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
    public static void main(String[] args) {
        int matrix[][] = {
          {1,2,3},
          {4,5,6},
          {7,8,9}  
        };

        print(matrix);

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(i <= j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        print(matrix);
    }
}
