class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                str.append(Character.toLowerCase(c));
            }
        }
        int l=0,r=str.length()-1;
        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }return true;
    }
}