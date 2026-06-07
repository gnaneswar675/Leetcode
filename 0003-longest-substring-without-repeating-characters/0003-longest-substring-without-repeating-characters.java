class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,res=0,n=s.length();
        HashSet<Character>set=new HashSet<>();
        while(right<n){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            res=Math.max(right-left+1,res);
            right++;
        }
        return res;
    }
}