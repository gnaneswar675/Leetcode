class Solution {
    void swap(int nums1[],int nums2[],int i,int j){
        int t=nums1[i];
        nums1[i]=nums2[j];
        nums2[j]=t;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=0;
        while(i>=0 && j<n)
        {
            if(nums1[i]>nums2[j]){
                swap(nums1,nums2,i,j);
                i--;j++;
            }else{
                break;
            }
        }
        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);
        for(int c=0;c<n;c++){
            nums1[m+c]=nums2[c];
        }
    }
}