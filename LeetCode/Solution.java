package LeetCode;

class Solution {
    static boolean status;
    static int row = 0;
    static int col = 0;

    public static void solveSudoku(char[][] board) {
        if(row == 9){
            status = true;
            print(board);
            return;
        }

        int nrow;
        int ncol;
        int crow = row;
        int ccol = col;
        
        if(col == 8){
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        if(board[row][col] != '.'){
            row = nrow;
            col = ncol;
            solveSudoku(board);
            if(status == true){
                return;
            }
        } else {
            for(int i = 1; i < 10; i++){
                if(isSafe(board,row,col,i)){
                    board[row][col] = (char) (i+'0');
                    row = nrow;
                    col = ncol;
                    solveSudoku(board);
                    if(status == true){
                        return;
                    } else {
                        row = crow;
                        col = ccol;
                        board[row][col] = '.';
                    }
                }
            }
        }
        row = crow;
        col = ccol;
        status = false;
        return;
    }

    public static boolean isSafe(char[][] board,int row,int col,int k){
        char key = (char)(k+'0');
        //row & colum
        for(int i = 0; i < 9; i++){
            if(board[i][col] == key){
                return false;
            }
            if(board[row][i] == key){
                return false;
            }
        }
        
        //greed
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);
        for(int i = sr ; i < (sr+3); i++){
            for(int j = sc; j < (sc+3); j++){
                if(board[i][j] == key){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void print(char[][] board){

        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 0; i < 9; i++){
            if(i==3 || i==6) System.out.println();

            for(int j = 0; j < 9; j++){
                if(j==3 || j==6) System.out.print("  ");
                System.out.print(" "+board[i][j]+" ");
            }
            
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }
    
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);
    }
}