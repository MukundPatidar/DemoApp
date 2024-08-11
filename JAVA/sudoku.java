import java.util.Scanner;

public class sudoku {
    
    static int sudoku[][] = new int[9][9];
    // static int sudoku[][] = {
    //     {5,3,0,0,7,0,0,0,0},   
    //     {6,0,0,1,9,5,0,0,0},   
    //     {0,9,8,0,0,0,0,6,0},   
    //     {8,0,0,0,6,0,0,0,3},   
    //     {4,0,0,8,0,3,0,0,1},   
    //     {7,0,0,0,2,0,0,0,6},   
    //     {0,6,0,0,0,0,2,8,0},   
    //     {0,0,0,4,1,9,0,0,5},   
    //     {0,0,0,0,8,0,0,7,9},   
    // };

    public static void input(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter all element of sudoku: ");
            int rows[] = new int[9];
            for(int i = 0; i < 9; i++){
                System.out.print("Enter elements of row "+(i+1)+" : ");
                rows[i] = scan.nextInt();
                System.out.println();
            }

            for(int i = 0; i < 9; i++){
                for(int j = 8; j >= 0; j--){
                    int digit = rows[i]%10;
                    rows[i] /= 10;
                    sudoku[i][j] = digit;
                }
            }

            scan.close();
        }
    }

    public static void print(){

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

    public static boolean solve(int row,int col){
        if(row == 9){
            return true;
        }

        int nrow;
        int ncol;
        
        if(col == 8){
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        if(sudoku[row][col] != 0){
            if(solve(nrow,ncol)){
                return true;
            }
        } else {
            for(int i = 1; i < 10; i++){
                if(isSafe(row,col,i)){
                    sudoku[row][col] = i;
                    // print();
                    if(solve(nrow,ncol)){
                        return true;
                    } else {
                        sudoku[row][col] = 0;
                        // print();
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int row,int col,int key){
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

    public static void main(String args[]){
        input();
        System.out.println("Unsolved Sudoku");
        print();
        
        if(solve(0,0)){

        System.out.println("solved Sudoku");
        print();
        }
    }
}