class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:prerequisites){
            adj.get(edge[0]).add(edge[1]);
        }
        int[] vis=new int[numCourses];
        int[] dfsvis=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(traverse_dfs(i,adj,vis,dfsvis))
                    return false;
            }
        }
        return true;
    }
    public boolean traverse_dfs(int cur,List<List<Integer>> adj,int vis[],int dfsvis[]){
        vis[cur]=1;
        dfsvis[cur]=1;
        for(int num:adj.get(cur)){
            if(vis[num]==0){
                if(traverse_dfs(num,adj,vis,dfsvis))
                return true;
            }            
            else if(dfsvis[num]==1)
                return true;          
            
        }
        dfsvis[cur]=0;
        return false;
    }
}