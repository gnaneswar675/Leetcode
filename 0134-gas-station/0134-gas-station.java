class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gt=0,ct=0;
        for(int i=0;i<gas.length;i++){
            gt+=gas[i];
            ct+=cost[i];
        }
        if(gt<ct)return -1;
        int start=0;int temp=0;
        for(int i=0;i<gas.length;i++){
            temp=temp+gas[i]-cost[i];
            if(temp<0){
                start=i+1;temp=0;
            }
        }return start;
    }
}