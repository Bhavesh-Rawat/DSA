

# N-ary Tree Preorder Traversal



Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
 
 
#
Example :

Input: root = [1,null,3,2,4,null,5,6]


Output: [1,3,5,6,2,4]




## Code

```java
class Solution {
    public List<Integer> preorder(Node root) 
    {
        List<Integer> answer = new ArrayList<>();
        npreorder(root,answer);
        return answer;
    }
    public void npreorder(Node root, List<Integer> answer)
    {
      if (root == null)
      return;

      answer.add(root.val);

    for(Node child:root.children)
       {
            npreorder(child, answer);
        }
        
     return;
    }
}

```


## Problem and Solution Links

 - [Problem](https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/)
