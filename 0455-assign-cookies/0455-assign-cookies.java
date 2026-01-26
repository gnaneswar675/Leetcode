class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0,res=0,j=0;
        Arrays.sort(s);Arrays.sort(g);        
        while(i<g.length&&j<s.length)
        {
            if(s[j]>=g[i])
            {
                res++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return res;
    }
}