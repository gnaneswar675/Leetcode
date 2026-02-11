class Solution {
    public int maxProfit(int[] prices) {
        int minp=Integer.MAX_VALUE;
        int maxpro=0;

        for (int i=0;i<prices.length;i++)
        {
            if (prices[i]<minp){
                minp=prices[i];
            }
            else if (prices[i]-minp>maxpro){
                maxpro=prices[i]-minp;
            }
        }
        return maxpro;
    }
}