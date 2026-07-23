class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        List<Integer>reslist=new ArrayList<>();
        for(int num:order){
            if(set.contains(num)){
                reslist.add(num);
            }
        }
        int res[]=new int[reslist.size()];
        for(int i=0;i<reslist.size();i++){
            res[i]=reslist.get(i);
        }
        return res;
    }
}