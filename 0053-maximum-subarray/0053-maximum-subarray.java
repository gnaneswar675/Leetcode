class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int cursum=0;
        for(int i=0;i<nums.length;i++)
        {
            cursum+=nums[i];
            res=Math.max(cursum,res);
            if(cursum<0){
                cursum=0;
            }
            
        }
        return res;
    }
}