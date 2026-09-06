class Solution {
    public boolean isNStraightHand(int[] hand, int groupsize) {
        if((hand.length % groupsize)!=0)return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        
        for(int a:hand){
            if(map.get(a)==0)
                continue;
            
            for(int j=0;j<groupsize;j++){
                int num=a+j;
                if(map.getOrDefault(num,0)==0){
                    return false;
                }
                map.put(num,map.get(num)-1);
            }
        }
        return true;

    }
}