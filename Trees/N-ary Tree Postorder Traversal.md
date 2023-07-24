

# N-ary Tree Postorder Traversal



Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value
 
 
#
Example :

Input: root = [1,null,3,2,4,null,5,6]


Output: [5,6,3,2,4,1]



## Code

```java
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        postordertraversal(root,answer);
        return answer;
    }
    public void postordertraversal(Node root, List<Integer> answer) 
    {
    if (root == null)
    return;
       
        for(Node child:root.children)
        {
            postordertraversal(child, answer);
        }
        
        answer.add(root.val);
        
        return;
    }
}

```


## Problem and Solution Links

 - [Problem](https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/)
