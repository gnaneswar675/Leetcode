class Solution {
    public int sumOfPrimesInRange(int num) {
        int rv=rev(num);int res=0;
        int l=Math.min(num,rv);
        int r=Math.max(rv,num);
        for(int i=l;i<=r;i++){
            if(prime(i)){
                res+=i;
            }
        }return res;
        
    }
    public boolean prime(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public int rev(int n){
        int res=0;
        while(n>0){
            res=res*10+(n%10);
            n=n/10;
        }return res;
    }
}