class Trie {
    private TrieNode root;
        
    private class TrieNode{
        public boolean isKey = false;
        Map<Character, TrieNode> links = new HashMap<>();
        
        public TrieNode(){
        }
                
        public void setKey(){
            isKey = true;
        }
     }
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word.length() < 1){
            return;
        }
        
        TrieNode temp = root;
        for(int i = 0;i < word.length();i ++){
            char c = word.charAt(i);
            //System.out.println("before, i: " + i + " key: " + temp.links.get(c));
            if(temp.links.containsKey(c)){                            
                temp = temp.links.get(c);
            } else{
                temp.links.put(c, new TrieNode());                            
                temp = temp.links.get(c);
            }

            //System.out.println("after, i: " + i + " key: " + temp.links.get(c));
            //System.out.println("isKey: " + temp.isKey);
        }
        
        temp.setKey();
        return;
    }
    
  
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word.length() < 1){
            return false;
        }
        
        TrieNode temp = root;
        for(int i = 0;i < word.length();i ++){
            char c = word.charAt(i);
            if(temp.links.containsKey(c)){
                //System.out.println("i: " + i + " isKey: " + temp.isKey);
                temp = temp.links.get(c);
            } else{
                return false;
            }                        
        }
        if(temp.isKey){
            return true;
        } else{
            return false;
        }
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(int i = 0;i < prefix.length();i ++){
            char c = prefix.charAt(i);
            if(temp.links.containsKey(c)){
                temp = temp.links.get(c);
            } else{
                return false;
            }
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
