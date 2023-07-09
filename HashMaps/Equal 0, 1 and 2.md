
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
//User function Template for Java
class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
        // code here
        long answer = 0;
        // long and integer can be added
        int z0 = 0;
        int z1 = 0;
        int z2 = 0;
        // initialization
        
        HashMap<String,Integer> memo = new HashMap<>();
        // Key is Character and Value is Frequency
        String expression = (z1 - z0)+ "#" + (z2 - z1);
        // "()" operator presidence and "#" as string to character
        
        memo.put(expression,1);
        // intializing entry to avoid corner cases
        
        for(int i = 0; i < str.length(); i++)
        // iterating over array
        {
            if (str.charAt(i) == '0')
            // incrementing count of z0 if current index have '0' character
            {
                z0 += 1;
            }
            else if (str.charAt(i) == '1')
            // incrementing count of z1 if current index have '1' character
            {
               z1 += 1; 
            }
            else 
            {
                z2 += 1;
            // incrementing count of z2 if current index have '2' character
            }
            
            expression = (z1 - z0)+ "#" +(z2 - z1);
            // calculating expression with updated values of z0,z1,z2 to update/enter in Hash Map
            
            if(memo.containsKey(expression))
            // if there is already entry in hash map
            {
                answer += memo.get(expression);
                memo.put(expression,memo.get(expression)+1);
                // increment its frequency
            }
            else
            {
                 memo.put(expression,1);
                 // enter frequecy if not present
            } 
          
            
        }
        return answer;
    }
}    
```


## Problem Link

 - [geeksforgeeks](https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)
