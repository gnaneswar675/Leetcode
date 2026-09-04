class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int l=0,r=0;
        while(r<nums.length){
            if(nums[r]==1){
                res=Math.max(res,r-l+1);
                r++;
            }
            else{
                l=r+1;r++;
            }
        }
        return res;
    }
}