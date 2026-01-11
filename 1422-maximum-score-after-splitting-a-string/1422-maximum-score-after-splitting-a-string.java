class Solution {
    public int maxScore(String s) {
        int o=0,res=0,z=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1'){
                o++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                z++;
            }else{
                o--;
            }
            res=Math.max(o+z,res);
        }return res;

    }
}