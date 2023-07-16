
## Problem Link

 - [leetcode](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)

# Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 
 
#
Example :

Input: root = [3,9,20,null,null,15,7]


Output: 3




## Code

```java
class Solution {
    public int maxDepth(TreeNode root) {
        return maxheight(root);
    }

    private int maxheight(TreeNode root) {
        if(root == null)
        // can't write 0 as it is also a value only use null in trees
        {
            return 0;
            // as no children present return 0
        }
        int leftNode = 1 + maxheight(root.left);
        // for left node and as it is below root node thus +1

        int rightNode = 1 + maxheight(root.right);
        // for left node and as it is below root node thus +1
        return Math.max(leftNode,rightNode);
    }
}
```

# Complexity
- Time complexity:  $$O(n)$$
As code is iterating on all the nodes atleast once to find it's maximum depth


- Space complexity: $$O(1)$$  
   As we are note storing.
 -  Auxilary recursive space :$$O(h)$$ 
As the tree is already stored and only need the maximum depth thus space is maximum height of tree i.e h.



 