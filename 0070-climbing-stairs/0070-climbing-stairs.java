class Solution {
    public int climbStairs(int n) {
        if(n<=3)return n;
    int pr1=3,pr2=2,c=0;
        for(int i=3;i<n;i++){
            c=pr1+pr2;
            pr2=pr1;
            pr1=c;
        }return c;
        
    }
}