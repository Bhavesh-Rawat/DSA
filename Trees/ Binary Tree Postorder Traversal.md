

# Maximum Depth of N-ary Tree


Given the root of a binary tree, return the preorder traversal of its nodes' values.
 
 
#
Example :

Input: root = [1,null,2,3]

Output: [1,2,3]




## Code

```java
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        preorder(root,answer);
        return answer;
    }
    public void preorder(TreeNode root, List<Integer> answer)
    {
     if(root == null)
     return ;

     answer.add(root.val);
     // node process
     preorder(root.left,answer);
     //left child node process
     preorder(root.right,answer);
     //right child node process
     return;

    }
}
```


## Problem Link

 - [leetcode](https://leetcode.com/problems/binary-tree-preorder-traversal/description/)
