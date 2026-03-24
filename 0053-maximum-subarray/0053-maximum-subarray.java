class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];int n=nums.length;
        int temp=nums[0];
        for(int i=1;i<n;i++)
        {
            temp=Math.max(nums[i],temp+nums[i]);
            res=Math.max(res,temp);
        }return res;
    }
}