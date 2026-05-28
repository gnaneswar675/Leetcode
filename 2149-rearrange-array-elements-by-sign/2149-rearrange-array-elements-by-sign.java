class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int num:nums)
        {
            if(num>0){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }
        for(int i=0;i<neg.size();i++){
            nums[i*2]=pos.get(i);
            nums[i*2+1]=neg.get(i);
        }
        return nums;
    }
}