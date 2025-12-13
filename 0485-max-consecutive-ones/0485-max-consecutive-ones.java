class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur=0,res=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            {
                cur+=1;
                res=Math.max(cur,res);
            }
            else
            {
                cur=0;
            }
        }
        return res;
    }
}