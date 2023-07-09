
# Equal 0, 1 and 2

Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

 
#
Example 1:

Input:

S = "aabacbebebe" , K = 3

Output: 7

Explanation: "cbebebe" is the longest substring with K distinct characters.



## Code

```java
class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
        // code here
        long answer = 0;
        int z0 = 0;
        int z1 = 0;
        int z2 = 0;
        
        HashMap<String,Integer> memo = new HashMap<>();
        String expression = (z1 - z0)+ "#" + (z2 - z1);
        memo.put(expression,1);
        
        for(int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == '0')
            {
                z0 += 1;
            }
            else if (str.charAt(i) == '1')
            {
               z1 += 1; 
            }
            else 
            {
                z2 += 1;
            }
            
            expression = (z1 - z0)+ "#" +(z2 - z1);
            if(memo.containsKey(expression))
            {
                answer += memo.get(expression);
                memo.put(expression,memo.get(expression)+1);
            }
            else
            {
                 memo.put(expression,1);
            } 
          
            
        }
        return answer;
    }
}    
```


## Problem Link

 - [geeksforgeeks](https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)
