class Solution {
    public int distinctSubseqII(String s) {
        int dp[]=new int[26];
        int MOD=1_000_000_007;
        int total=0;
        for(char c : s.toCharArray()){
            int index=c-'a';
            int old_total=total;
            int newsubseqs=(old_total+1-dp[index]+MOD)%MOD;
            total=(total+newsubseqs)%MOD;
            dp[index]=(dp[index]+newsubseqs)%MOD;
        }
        return total;
    }
}