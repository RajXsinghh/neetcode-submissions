class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        nQueens(board,0);
        return res;
        
    }

    public void nQueens(char [][]board, int row){
        if(row == board.length){
            res.add(printBoard(board));
            return;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1);
                board[row][j]='.';
            }
        }
    }

    public boolean isSafe(char [][]board, int row, int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q')
            return false;
        }

        // diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j] == 'Q')
            return false;
        }
        return true;
    }

    

    public List<String> printBoard(char [][]board){
        List<String> temp = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            temp.add(new String(board[i]));
        }
        return temp;
    }

}
