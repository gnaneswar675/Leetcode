class Solution {
    public int ladderLength(String startword, String endword, List<String> wordlist) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<wordlist.size();i++){
            set.add(wordlist.get(i));
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(startword,1));
        set.remove(startword);
        while(!q.isEmpty()){
            String wordd=q.peek().word;
            int count=q.peek().step;
            q.poll();
            if(wordd.equals(endword))return count;
            for(int i=0;i<wordd.length();i++){
                for(char ch='a' ; ch<='z';ch++){
                    char[] reparr=wordd.toCharArray();
                    reparr[i]=ch;
                    String repword=new String(reparr);
                    if(set.contains(repword)){
                        q.add(new Pair(repword,count+1));
                        set.remove(repword);
                    }
                }
            }
        }
        return 0;
    }
}
class Pair{
    String word;int step;
    Pair(String _word,int _step){
        this.word=_word;
        this.step=_step;
    }
}