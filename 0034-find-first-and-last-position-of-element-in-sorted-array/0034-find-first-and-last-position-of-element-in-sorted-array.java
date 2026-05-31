class Solution {
    public int firstocc(int nums[],int target){
        int n=nums.length,low=0;
        int high=n-1,first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                first=mid;
                high=mid-1;
            }
            else if(target>nums[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return first;
    }
    public int lastocc(int nums[],int target){
        int n=nums.length,low=0;
        int high=n-1,last=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                last=mid;
                low=mid+1;
            }
            else if(target>nums[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=firstocc(nums,target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last=lastocc(nums,target);
        return new int[]{first,last};
    }
}