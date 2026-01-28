class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List <Integer> subset=new ArrayList<>();
        backtrack(0,res,subset,nums);
        return res;
    }
    public void backtrack(int src,List<List<Integer>> res,List<Integer> subset,int[] arr)
    {
        if(src==arr.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(arr[src]);
        backtrack(src+1,res,subset,arr);
        subset.remove(subset.size()-1);
        backtrack(src+1,res,subset,arr);
    }
}