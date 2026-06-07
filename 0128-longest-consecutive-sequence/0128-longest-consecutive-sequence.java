class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int res=1;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)set.add(num);
        for(int num:set){
            if(!set.contains(num-1)){
                int c=1,x=num;
                while(x != Integer.MAX_VALUE &&
                       set.contains(x + 1)){
                    c++;x++;
                }
                res=Math.max(res,c);
            }
        }return res;
    }
}