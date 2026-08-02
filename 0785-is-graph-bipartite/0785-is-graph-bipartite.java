class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        for(int i=0;i<graph.length;i++)
            color[i]=-1;
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(bfs(i,color,graph)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int cur,int[] color,int graph[][]){
        Queue<Integer>q=new LinkedList<>();
        q.offer(cur);
        color[cur]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int nei:graph[node]){
                if(color[nei]==-1){
                    color[nei]=1-color[node];
                    q.offer(nei);
                }
                else if(color[nei]==color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}