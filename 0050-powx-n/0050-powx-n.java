class Solution {
    public double myPow(double x, int n) {
        double res=1;
        double tn=n;

        if(tn<0)
            tn=-1*tn;

        while(tn>0)
        {
            if(tn%2==0){
                x*=x;
                tn/=2;
            }
            else{
                res*=x;
                tn-=1;
            }
        }

        if(n<0)
            res=(double)1/(double)res;
        return res;
    }
}