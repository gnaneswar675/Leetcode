class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums.length/2;
        int x=nums[mid];
        for(int i=0;i<nums.length;i++){
            if(i==mid)continue;
            if(nums[i]==x)return false;
        }
        return true;
    }
}