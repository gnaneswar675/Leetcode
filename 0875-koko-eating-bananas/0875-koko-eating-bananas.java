class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1,high=maxi(piles);
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long totalhrs=findtothrs(piles,mid);
            if(totalhrs<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return low;
    }
    public int maxi(int arr[])
    {
        int res=arr[0];
        for(int a:arr){
            res=Math.max(res,a);
        }
        return res;
    }
    public long findtothrs(int arr[],int h){
        long res=0;
        for(int i=0;i<arr.length;i++){
            res+=(arr[i]+h-1)/h;
        }
        return res;
    }
}