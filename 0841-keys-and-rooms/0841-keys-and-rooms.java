class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] v=new boolean[rooms.size()];
        dfs(0,v,rooms);
        for (boolean i: v) {
            if (!i) return false;
        }
        return true;
    }
    void dfs(int src,boolean[] v,List<List<Integer>> rooms)
    {
        if(v[src]) return;
        v[src]=true;
        for(int i:rooms.get(src)){
            dfs(i,v,rooms);
        }
    }
}