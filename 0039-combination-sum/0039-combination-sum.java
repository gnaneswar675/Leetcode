class Solution {
    public static void traverse(int cur,int nums[],int target,List<Integer> list,List<List<Integer>> res){
        if(cur==nums.length){
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            return;            
        }
        if(nums[cur]<=target){
            list.add(nums[cur]);
            traverse(cur,nums,target-nums[cur],list,res);
            list.remove(list.size()-1);
        }
        traverse(cur+1,nums,target,list,res);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        traverse(0,nums,target,list,res);
        return res;
    }
}