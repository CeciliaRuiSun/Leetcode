class WordDictionary {
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
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
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
        }

        temp.setKey();
        return;
    }
    
    public boolean search(String word){
        if(word.length() < 1){
            return false;
        }
        
        return helper(root,word.toCharArray(),0);        
    }
    
    private boolean helper(TrieNode node, char[] ch, int k){
        if(k == ch.length){
            return node.isKey;
        }
        
        char c = ch[k];
        if(c == '.'){
            for(TrieNode child: node.links.values()){
                if(helper(child, ch, k + 1)){
                    return true;
                }
            }
        }
        
        if(!node.links.containsKey(c)){
            return false;
        }
        
        return helper(node.links.get(c), ch, k+1);
        
    }
    
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
