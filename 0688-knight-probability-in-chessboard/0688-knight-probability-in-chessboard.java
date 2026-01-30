class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        double dp[][]=new double[n][n];
        dp[row][column]=1;
        int[][]d={
            {2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}
        };
       while(k-->0){
        double ndp[][]=new double[n][n];
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]>0){
                    for(int dir[]:d){
                        int x=i+dir[0];
                        int y=j+dir[1];
                        if(x>=0&&x<n&&y>=0&&y<n){
                            ndp[x][y]=ndp[x][y]+dp[i][j]/8.0;
                        }
                    }
                }
            }
        }
        dp=ndp;
       }
       double res=0;
       for(int i=0;i<n;i++)
       for(int j=0;j<n;j++)
       res+=dp[i][j];
       return res;
        
    }
}