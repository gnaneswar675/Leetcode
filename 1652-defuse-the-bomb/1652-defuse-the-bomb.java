class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int res[]=new int[n];
        int sum=0;
        if(k>0)
        {
            for(int i=1;i<=k;i++)
            {
                sum+=code[i];
            }
            for(int i=0;i<n;i++)
            {
                res[i]=sum;
                sum=sum-code[(i+1)%n];
                sum=sum+code[(k+1+i)%n];
            }
        }
        else if(k==0){
            return res;
        }
        else
        {
            k=-k;
            for(int i=1;i<=k;i++)
            {
                sum+=code[(n-i)%n];
            }
            for(int i=0;i<n;i++)
            {
                res[i]=sum;
                sum-=code[(n+i-k)%n];
                sum+=code[i%n];
            }
        }return res;
    }
}