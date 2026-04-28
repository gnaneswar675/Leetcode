class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        int n=nums.length;
        int piv_index=-1;
        for (int i=n-2;i>=0;i--)
        {
            if (nums[i]<nums[i+1]) 
            {
                piv=i;
                break;
            }
        }

        if (piv==-1)
        {
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>piv;i--){
            if (nums[i]>nums[piv]){

                int t=nums[piv];
                nums[piv]=nums[i];
                nums[i]=t; 
                break;              

            }
        }        

        reverse(nums,piv+1,n-1);
        
    }

    private static void reverse(int arr[],int s,int e)
    {
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}