class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Arrays.sort(nums);
        int c=1;
        int maxc=1;
        for(int i=1;i<nums.length;i++)
        {
            if (nums[i]==nums[i-1])
            {
                continue;
            }

            if (nums[i]==nums[i-1]+1)
            {
                c++;
            }
            else
            {
                maxc=Math.max(c,maxc);
                c=1;
            }
        } 
        return Math.max(c,maxc);      
    }
}