class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>subset=new ArrayList<>();
        backtrack(0,candidates,target,subset,res);
        return res;
    }
    public void backtrack(int src,int[] arr,int target,List<Integer>subset, List<List<Integer>> res)
    {if(target==0)
        {
            res.add(new ArrayList<>(subset));
            return;
        }
        if(src==arr.length||target<0)
        {
            return;
        }
        
        subset.add(arr[src]);
        backtrack(src,arr,target-arr[src],subset,res);
        subset.remove(subset.size()-1);
        backtrack(src+1,arr,target,subset,res);
    }
}