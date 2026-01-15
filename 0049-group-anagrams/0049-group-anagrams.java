class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> map=new HashMap<>();
        for(String str: strs)
        {
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String sw=new String(c);
            if(!(map.containsKey(sw))){
                map.put(sw,new ArrayList<>());
            }
            map.get(sw).add(str);
        }
        return new ArrayList(map.values());
    }
}