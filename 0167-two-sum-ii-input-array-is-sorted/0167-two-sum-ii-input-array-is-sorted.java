class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;boolean flag=false;
        while(l<r)
        {
            if(nums[l]+nums[r]==target){
                flag=true;
                break;
            }else if(nums[l]+nums[r]>target){
                r--;
            }else{
                l++;
            }
        }
        int []res=new int[2];
        if(!flag)
        {
            res[0]=-1;
            res[1]=-1;
        }
        else{
            
            res[0]=l+1;
            res[1]=r+1;
        }
        return res;
    }
}