class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res=new ArrayList<>();
       List<Integer> sub=new ArrayList<>();
       createsub(sub,res,0,nums);
       return res;
    }
    void createsub(List<Integer> sub,List<List<Integer>> res,int index,int nums[])
    {
        if(index==nums.length)
        {
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[index]);
        createsub(sub,res,index+1,nums);
        sub.remove(sub.size()-1);
        createsub(sub,res,index+1,nums);
    }    
}