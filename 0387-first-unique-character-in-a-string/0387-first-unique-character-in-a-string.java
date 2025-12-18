class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        char ch[]=s.toCharArray();
        for(char c:ch)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:ch){
            if(map.get(c)==1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}