class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            adj.get(edge[1]).add(edge[0]);
        }
        List<Integer> resl=new ArrayList<>();
        int[] vis=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(!traverse_dfs(i,vis,adj,resl)){
                    
                    return new int[0];
                }
            }
        }
        Collections.reverse(resl);
        int[] resarr=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            resarr[i]=resl.get(i);
        }
        return resarr;
    }
    public boolean traverse_dfs(int cur,int[] vis,List<List<Integer>> adj,List<Integer> resl){
        vis[cur]=1;
        for(int num:adj.get(cur)){
            if(vis[num]==1)return false;

            if(vis[num]==0){
                if(!traverse_dfs(num,vis,adj,resl)){
                    return false;
                }
            }
        }
        vis[cur]=2;
        resl.add(cur);

        return true;

    }
}