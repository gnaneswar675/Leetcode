class Solution {
    public int singleNumber(int[] nums) {
        int res=0,n=nums.length;
        for(int bi=0;bi<32;bi++){
            int c=0;
            for(int i=0;i<n;i++){
                if((nums[i] & (1<<bi))!=0){
                    c++;
                }
            }
            if(!(c%3==0)){
                res=res|(1<<bi);
            }
        }
        return res;
    }
}