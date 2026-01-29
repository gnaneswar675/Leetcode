class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int total=0;
        int count=0;
        Queue <int[]>rotten=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0)total++;
                if(grid[i][j]==2){
                    rotten.add(new int[]{i,j});
                }
            }
        }
        int days=0;
        int[] dx=new int[]{0,0,1,-1};
        int[] dy=new int[]{1,-1,0,0};
        while(!rotten.isEmpty()){
            int k=rotten.size();
            count+=k;
            for(int i=0;i<k;i++){
                int[] cur=rotten.poll();
                int x=cur[0],y=cur[1];
                for(int d=0;d<4;d++){
                    int nx=x+dx[d],ny=y+dy[d];
                    if(nx<0||ny<0||nx>=m||ny>=n||grid[nx][ny]!=1)continue;
                    rotten.add(new int[]{nx,ny});
                    grid[nx][ny]=2;
                }
            }
            if (!rotten.isEmpty())days++;
           
            
        }
         if(total==count){
                return days;
            }else{
                return -1;
            }
    }
}