class Solution{
    class Node{
        int x,y,px,py;
        Node(int x,int y,int px,int py){
            this.x=x;
            this.y=y;
            this.px=px;
            this.py=py;
        }
    }
    public boolean bfs(char[][] grid,boolean[][] visited,int startX,int startY){
        int rows=grid.length;
        int cols=grid[0].length;
        int[][] directions={ {1,0},{-1,0},{0,1},{0,-1}};
        Queue<Node> queue=new LinkedList<>();
        queue.offer(new Node(startX,startY,-1,-1));
        visited[startX][startY]=true;
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            for(int[] dir:directions){
                int nx=curr.x+dir[0];
                int ny=curr.y+dir[1];
                if(nx>=0&&ny>=0&&nx<rows&&ny<cols){
                    if(grid[nx][ny]==grid[curr.x][curr.y]){
                        if(!visited[nx][ny]){
                            visited[nx][ny]=true;
                            queue.offer(new Node(nx,ny,curr.x,curr.y));

                        }else if(nx!=curr.px||ny!=curr.py){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean containsCycle(char[][] grid){
        int rows=grid.length;
        int cols=grid[0].length;
        boolean[][] visited=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(!visited[i][j]){
                    if(bfs(grid,visited,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}