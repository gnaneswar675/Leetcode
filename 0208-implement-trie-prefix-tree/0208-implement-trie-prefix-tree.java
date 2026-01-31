class Trie {

    class TrieNode{
        TrieNode children[]=new TrieNode[26];
        boolean eow;
    }
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur=root;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(cur.children[idx]==null){
                cur.children[idx]=new TrieNode();
            }
            cur=cur.children[idx];
        }
        cur.eow=true;

    }
    
    public boolean search(String word) {
        TrieNode temp=root;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(temp.children[idx]==null){
                return false;
            }temp=temp.children[idx];
        }
        return temp.eow;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode temp=root;
        for(char ch:prefix.toCharArray()){
            int idx=ch-'a';
            if(temp.children[idx]==null){
                return false;
            }temp=temp.children[idx];
        }
        return true;

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */