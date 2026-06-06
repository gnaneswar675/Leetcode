class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0,n1=Integer.MIN_VALUE,n2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(c1==0 && nums[i]!=n2){
                n1=nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=n1){
                n2=nums[i];
                c2=1;
            }
            else if(nums[i]==n1){
                c1++;
            }
            else if(nums[i]==n2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }

        }
        List<Integer> res=new ArrayList<>();
        int t1=0,t2=0;
        for(int a:nums){
            if(a==n1)t1++;
            if(a==n2)t2++;
        }
        int mini=nums.length/3;
        if(t1>mini)res.add(n1);
        if(t2>mini)res.add(n2);
        return res;
    }
}