class Solution {   
    public int findCircleNum(int[][] mat) {
       ArrayList<ArrayList<Integer>> list=new ArrayList<>();
       for(int i=0;i<mat.length;i++){
        list.add(new ArrayList<>());
       }
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1 &&i!=j){
                list.get(i).add(j);
                list.get(j).add(i);
            }
        }
       }
       int vis[]=new int[mat.length];
       int res=0;
       for(int i=0;i<mat.length;i++){
        if(vis[i]==0){
            dfs(vis,list,i);
            res++;
        }
       }
       return res;
    }
    public void dfs(int[] vis,ArrayList<ArrayList<Integer>> list,int src){
        vis[src]=1;
        for(int node:list.get(src)){
            if(vis[node]==0){
                dfs(vis,list,node);
            }
        }
    }
}