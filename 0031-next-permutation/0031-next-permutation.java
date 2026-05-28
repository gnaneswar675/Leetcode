class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1,n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(0,n-1,nums);
            return;
         
        }
        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(idx,i,nums);
                break;
            }
        }
        reverse(idx+1,n-1,nums);
       
    }
    void reverse(int s,int e,int[] nums){
        while(s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;

        }
    }
    void swap(int a,int b,int[] nums){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
}