class Solution {
    public int findCenter(int[][] edges) {
         Set <Integer>set=new HashSet<>();
         for(int i:edges[0])set.add(i);
         for(int i:edges[1]){
            if (set.contains(i)){
                return i;
            }
         }return -1;
    }
}