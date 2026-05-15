class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
        if(suits[0]==suits[1]&&suits[1]==suits[2]&&suits[2]==suits[3]&&suits[3]==suits[4]){
            return "Flush";
        }
        int a[]=new int[15];
        boolean pair=false;
        for(int i=0;i<5;i++){
            a[ranks[i]]++;
            if(a[ranks[i]]==3){
                return "Three of a Kind";
            }
            if(a[ranks[i]]==2){
                pair=true;
            }
        }
        if (pair)return "Pair";
        return "High Card";
        
    }
}