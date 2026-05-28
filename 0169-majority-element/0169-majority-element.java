class Solution {
    public int majorityElement(int[] nums) {
        int x=0, n=nums.length,c=0;
        for(int i=0;i<n;i++){
            if(c==0)
            {
                x=nums[i];
                c=1;
            }
            else if(nums[i]==x)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        return x;
    }
}