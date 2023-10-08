class Solution {
    public void helper(char[][] board,List<List<String>> allboards, int col){
            if(col==board.length){
                saveBoard(board,allboards);
                return;
            }
            for(int row = 0;row<board.length;row++){
                if(isSafe(row,col,board)){
                board[row][col]='Q';    
                helper(board,allboards,col+1);
                board[row][col]='.';
                }
            }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoards,0);
        return allBoards;
    }
    public void saveBoard(char[][] board,List<List<String>> allboards){
        String row="";
        List<String> b = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row ="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'Q')
                 row+="Q";
                else
                row+="." ;
            }
            b.add(row);
        }
        allboards.add(b);
    }
    public boolean isSafe(int row, int col, char[][]board){
        int n =board.length;
        //Horizontal
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q')
            return false;
        }
        //Vertical
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')
            return false;
        }
        //Upper left
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q')
            return false;
        }
        //Upper right
        r =row;
        for(int c=col;c<n && r>=0;c++,r--){
            if(board[r][c]=='Q')
            return false;
        }
        //lower left
        r = row;
         for(int c=col;c>=0 && r<n;c--,r++){
            if(board[r][c]=='Q')
            return false;
        }
        //lower right
        r = row;
         for(int c=col;c<n && r<n;c++,r++){
            if(board[r][c]=='Q')
            return false;
        }
      return true;
    }
}