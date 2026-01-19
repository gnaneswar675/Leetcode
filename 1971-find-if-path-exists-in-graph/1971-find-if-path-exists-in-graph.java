class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int edge[]:edges)
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] v = new boolean[n];
        return dfs(graph,source,destination,v);
    }
    public boolean dfs(List<List<Integer>> graph,int src ,int des,boolean[] v)
    {
        if(src==des)return true;
        v[src]=true;
        for(int nei:graph.get(src))
        {
            if(!v[nei])
            {
                if(dfs(graph,nei,des,v)){
                    return true;
                }
            }
        }return false;
    }
}