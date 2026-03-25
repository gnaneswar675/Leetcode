class Solution {
    public String frequencySort(String str) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
		    map.put(c,map.getOrDefault(c,0)+1);
		}
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        StringBuilder temp=new StringBuilder();
        for(Map.Entry<Character,Integer> e:list){
            char c=e.getKey();
            int n=e.getValue();
            while(n-->0){
                temp.append(c);
            }
        }return temp.toString();
    }
}