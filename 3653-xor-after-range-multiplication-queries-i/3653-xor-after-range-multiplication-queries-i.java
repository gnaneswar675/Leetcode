class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD=1_000_000_007;
        int[][]m =queries;
        for (int[] query : m) {
            int l=query[0];
            int r=query[1];
            int k=query[2];
            int v=query[3];
            for (int i=l; i<= r;i+= k) {
                nums[i] =(int)(((long)nums[i]*v)% MOD);
            }
        }
        int res=0;
        for (int val : nums) {
            res^=val;
        }
        return res;
    }
}
