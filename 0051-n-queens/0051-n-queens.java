class Solution {
    public static void traverse(int col,int n,char[][] board,List<List<String>> res,int[] leftrows,int[] upperdig,int[] lowerdig){
        if(col==n){
            List<String> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new String(board[i]));
            }
            res.add(list);
            return;
        }
        for(int row=0;row<n;row++){
            if(leftrows[row]==0 && upperdig[n-1+col-row]==0 && lowerdig[row+col]==0){

                board[row][col]='Q';
                leftrows[row]=1;
                upperdig[n-1+col-row]=1;
                lowerdig[row+col]=1;

                traverse(col+1,n,board,res,leftrows,upperdig,lowerdig);

                board[row][col]='.';
                leftrows[row]=0;
                upperdig[n-1+col-row]=0;
                lowerdig[row+col]=0;


            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int leftrows[]=new int[n];
        int upperdig[]=new int[2*n-1];
        int lowerdig[]=new int[2*n-1];
        List<List<String>>res=new ArrayList<>();
        traverse(0,n,board,res,leftrows,upperdig,lowerdig);
        return res;

    }
}