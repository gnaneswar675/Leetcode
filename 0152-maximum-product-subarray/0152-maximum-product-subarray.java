class Solution {
    public int maxProduct(int[] nums) {
        int mn=nums[0],mx=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=0){
                int temp=mx;
                mx=mn;
                mn=temp;
            }
            mx=Math.max(nums[i],mx*nums[i]);
            mn=Math.min(nums[i],mn*nums[i]);
            res=Math.max(mn,Math.max(res,mx));
        }return res;
    }
}