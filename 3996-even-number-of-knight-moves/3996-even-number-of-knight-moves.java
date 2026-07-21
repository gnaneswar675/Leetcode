class Solution {
    public boolean canReach(int[] start, int[] target) {
        int a=Math.abs(start[0]-target[0]);
        int b=Math.abs(start[1]-target[1]);
        int s=a+b;
        if(s%2==0)return true;
        return false;
    }
}