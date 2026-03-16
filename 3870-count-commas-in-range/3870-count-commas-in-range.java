class Solution {
    public int countCommas(int num) {
        long res=0,s=1000;int temp=1;
        while(s<=num){
            long t=Math.min(s*1000-1,num);
            long t1=t-s+1;
            res+=t1*temp;
            s=s*1000;temp++;
        }return (int)res;
    }
}