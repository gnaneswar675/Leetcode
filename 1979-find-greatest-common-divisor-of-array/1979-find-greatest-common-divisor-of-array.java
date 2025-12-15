class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }else if(num<min){
                min=num;
            }
        }
        for(int i=min;i>=1;i--)
        {
            if(min%i==0 && max%i==0){
                return i;
            }
        }
        return 1;
    }
}