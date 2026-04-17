class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int rem,sum=0;
        
        if (x<0)
        return false;
        while (x!=0)
        {
            rem = x%10;
            sum = sum*10+rem;
            x=x/10;
        }  
        if (t==sum)
        return true;
        else
        return false ;
    }
}