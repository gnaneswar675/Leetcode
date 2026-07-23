class Solution {
    public int[] concatWithReverse(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        for(int i=nums.length-1;i>=0;i--){
            list.add(nums[i]);
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}