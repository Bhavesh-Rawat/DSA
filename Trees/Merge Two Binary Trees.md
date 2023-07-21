

# Merge Two Binary Trees

You are given two binary trees root1 and root2.

Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.

Return the merged tree.

Note: The merging process must start from the root nodes of both trees.
 
 
#
Example :

Input : root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]

Output: [3,4,5,5,4,null,7]




## Code

```java
class Solution 
{
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {
        return merge(root1,root2);
    }
    private TreeNode merge(TreeNode t1,TreeNode t2) 
    {
         if(t1 == null)
         // if t1's node is null then it will return t2's node 
         // as 0 plus any number is number itself. 
         return t2;

         if(t2 == null)
         // same logic as above
         return t1;

         TreeNode newNode = new TreeNode(t1.val+t2.val);
         // creating a new node by adding the corresponding values of 
         // node present in tree t1 and t2.

         newNode.left = merge(t1.left,t2.left);
         // merging two nodes of differnet tree 
         //   (4,5)  value 4 from left node in tree t1
         //                5 from left node in tree t2                   

         newNode.right = merge(t1.right,t2.right);
         // same logic as above but from right node of both trees.

         return newNode;
         // returning new node i.e addition of t1,t2.
    }
}

```


## Problem and Solution Links

 - [Problem](https://leetcode.com/problems/merge-two-binary-trees/)

 - [Solution](https://leetcode.com/problems/merge-two-binary-trees/solutions/3798134/solution-with-explamation-and-complixity/)
