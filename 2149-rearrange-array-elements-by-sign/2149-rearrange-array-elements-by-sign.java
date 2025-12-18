class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int pos = 0, neg = 0;
        int idx = 0;

        while (idx < n) {
            while (nums[pos] < 0) pos++;
            while (nums[neg] > 0) neg++;
            res[idx++] = nums[pos++];
            res[idx++] = nums[neg++];
        }
        return res;
    }
}
