class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0; row<9; row++) {
            Set<Character> seen = new HashSet<>();
            for(int i=0;i<9;i++) {
                if(board[row][i] == '.'){
                    continue;
                }
                if(seen.contains(board[row][i])){
                    return false;
                }
                seen.add(board[row][i]);
            }
        }

        for(int col=0;col<9;col++){
            Set<Character> seen = new HashSet<>();
            for(int i=0;i<9;i++) {
                if(board[i][col] == '.'){
                    continue;
                }
                if(seen.contains(board[i][col])){
                    return false;
                }
                seen.add(board[i][col]);
            }
        }


        for(int row=0;row<9;row+=3) {
            for(int col=0;col<9;col+=3) {
                Set<Character> seen = new HashSet<>();
                for(int i=row; i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j] =='.'){
                            continue;
                        }
                        if(seen.contains(board[i][j])){
                            return false;
                        }
                        seen.add(board[i][j]);
                    }
                }
            }
        }
    return true;
    }
}
