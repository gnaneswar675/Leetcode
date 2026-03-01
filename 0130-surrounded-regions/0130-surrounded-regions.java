class Solution {
    public void solve(char[][] board) {
        if (board==null || board.length==0 || board[0].length==0){
            return ;
        }
        int r=board.length,c=board[0].length;
        for(int i=0;i<r;i++){
            dfs(board,i,0);
            dfs(board,i,c-1);
        }
        for(int i=0;i<c;i++){
            dfs(board,0,i);
            dfs(board,r-1,i);
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='G'){
                    board[i][j]='O';
                }
            }
        }
        
    }
    public void dfs(char[][] board,int r,int c){
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!='O'){
            return;
        }
        int i=r,j=c;
        board[i][j]='G';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    }
}