class Solution {
    public int countRotations(String s, int k) {
        int res=0;
        for(int i=0;i<s.length();i++){
            String str=s.substring(i)+s.substring(0,i);
            int score=0;
            for(int j=1;j<s.length();j++){
                if(str.charAt(j)==str.charAt(j-1)){
                    score++;
                }
            }
            if(score==k)
                res++;
        }
        return res;
    }
}