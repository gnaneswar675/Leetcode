class Solution {
    public int maxDistinct(String s) {
        HashSet<Character>set=new HashSet<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                res++;
                set.add(s.charAt(i));
            }
        }
        return res;
    }
}