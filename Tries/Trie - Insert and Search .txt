void insert(struct TrieNode *root, string key)
{
    // code here\
    
    for(int i=0;i<key.size();i++)
    {
        char x = key[i];
        if(root->children[x-'a']==NULL)
            root->children[x-'a'] = new TrieNode();
        
        if(i==key.size()-1)
        {
            root->isLeaf=true;
            return;
        }
            
        root=root->children[x-'a'];
    }
    return;
    

}

//Function to use TRIE data structure and search the given string.
bool search(struct TrieNode *root, string key) 
{
    // code here
    for(int i=0;i<key.size();i++)
    {
        char x = key[i];
        if(root->children[x-'a']==NULL)
            return false;
        
        if(i==key.size()-1 and root->isLeaf == false)
            return false;
            
        root=root->children[x-'a'];
    }
    return true;
}