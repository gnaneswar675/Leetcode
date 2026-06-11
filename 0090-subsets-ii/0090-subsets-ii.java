class Solution {
    public static void traverse(int cur,int[] nums,List<Integer> list,List<List<Integer>> res){
       
        res.add(new ArrayList<>(list));     
        
        for(int i=cur;i<nums.length;i++){
            if(i>cur && nums[i]==nums[i-1])continue;
            list.add(nums[i]);
            traverse(i+1,nums,list,res);
            list.remove(list.size()-1);

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        traverse(0,nums,list,res);
        return res;
    }
}