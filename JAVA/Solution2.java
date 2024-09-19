class Solution2 {
    public static void solveSudoku(char[][] board) {
           int row=0, col=0;

           while(row != 9){
                int nrow;
                int ncol;
                
                if(col == 8){
                    nrow = row + 1;
                    ncol = 0;
                } else {
                    nrow = row;
                    ncol = col + 1;
                }

                if(board[row][col] != '.'){
                    continue;
                } else {
                    for(int i = 1; i < 10; i++){
                        if(isSafe(board,row,col,i)){
                            board[row][col] = (char)i;
                            break;
                            // if(solve(sudoku,nrow,ncol)){
                            //     return true;
                            // } else {
                            //     sudoku[row][col] = '0';
                            // }
                        }
                    }
                }

                row = nrow;
                col = ncol;
           }

    }

    public static boolean isSafe(char[][] sudoku,int row,int col,int k){
        char key = (char)k;
        //row & colum
        for(int i = 0; i < 9; i++){
            if(sudoku[i][col] == key){
                return false;
            }
            if(sudoku[row][i] == key){
                return false;
            }
        }
        
        //greed
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);
        for(int i = sr ; i < (sr+3); i++){
            for(int j = sc; j < (sc+3); j++){
                if(sudoku[i][j] == key){
                    return false;
                }
            }
        }
        return true;
    }

    public static void print(char[][] sudoku){

        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 0; i < 9; i++){
            if(i==3 || i==6) System.out.println();

            for(int j = 0; j < 9; j++){
                if(j==3 || j==6) System.out.print("  ");
                System.out.print(" "+sudoku[i][j]+" ");
            }
            
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        
    }
}