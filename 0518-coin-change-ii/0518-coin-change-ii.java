public class Solution {
    public int change(int amt,int[] coins) {
        int[] dp=new int[amt+1];
        dp[0]=1;        
        for(int coin:coins)
            for (int j=coin;j<=amt;j++) 
                dp[j]+=dp[j-coin];        
        return dp[amt];
    }
}