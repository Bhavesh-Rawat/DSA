

# Binary Tree Inorder Traversal


Given the root of a binary tree, return the inorder traversal of its nodes' values.
 
 
#
Example :

Input: root = [1,null,2,3]

Output: [1,3,2]



## Code

```java
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> answer = new ArrayList<>();
        inordertraversal(root,answer);
        return answer;
    }
    public void inordertraversal(TreeNode root, List<Integer> answer)
    {
      if (root == null)
      return;

      inordertraversal(root.left,answer);
      answer.add(root.val);
      inordertraversal(root.right,answer);
      return;
    }
   
}

```


## Problem Link

 - [leetcode](https://leetcode.com/problems/binary-tree-inorder-traversal/description/)
