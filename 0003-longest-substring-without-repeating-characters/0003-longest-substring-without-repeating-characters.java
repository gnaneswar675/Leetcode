class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int l=0,r=0;
        HashMap <Character,Integer> freq=new HashMap<>(); 
        while(r<s.length())
        {
            freq.put(s.charAt(r),freq.getOrDefault(s.charAt(r),0)+1);
            while(freq.get(s.charAt(r))>1)
            {
                freq.put(s.charAt(l),freq.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,r-l+1);          
            r++;
        }return res;
    }
}