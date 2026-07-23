class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        while(n>=1){
            int rem=n%10;
            freq.put(rem,freq.getOrDefault(rem,0)+1);
            n/=10;
        }
        int res=0;
        for(Map.Entry <Integer,Integer> entry: freq.entrySet()){
            int num=entry.getKey();
            int numf=entry.getValue();
            res+=(num*numf);
        }
        return res;
    }
}