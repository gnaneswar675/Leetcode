class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cs=0;
        for(int i=0;i<k;i++)
        {
            cs+=nums[i];
        }double ms=cs;
        for(int i=1;i<=nums.length-k;i++)
        {
            cs=cs-nums[i-1]+nums[i+k-1];
            ms=Math.max(cs,ms);
        }
        double res=ms/k;
        return res;
    }
}