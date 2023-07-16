

# Maximum Depth of N-ary Tree


Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
 
 
#
Example :

Input: root = [1,null,3,2,4,null,5,6]


Output: 3




## Code

```java
class Solution {
    public int maxDepth(Node root) {
        return height(root);
    }

    public int height(Node root) {
        int answer = 0;
        if (root == null) 
        {
         return 0;
        }
        for(Node currentNode : root.children)
        {
        answer = Math.max(answer,height(currentNode));
        }
        return 1+ answer;
    }
}
```


## Problem Link

 - [leetcode](https://leetcode.com/problems/maximum-depth-of-n-ary-tree/)
