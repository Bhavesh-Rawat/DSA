
# Longest K unique characters substring

Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

 
#
Example 1:

Input:

S = "aabacbebebe" , K = 3

Output: 7

Explanation: "cbebebe" is the longest substring with K distinct characters.



## Code

```java
class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> memo = new HashMap<>();
        int answer = 0;
        int release = 0;
        int distinct = 0;
        
        for(int acquire = 0; acquire < s.length();acquire++)
        {
            Character currentChar = s.charAt(acquire);
            if(memo.containsKey(currentChar)){
                memo.put(currentChar,memo.get(currentChar)+1);
            }
            else
            {
                memo.put(currentChar,1);
                distinct += 1;
            }
            while(release <= acquire && distinct > k)
            {
                Character disChar = s.charAt(release);
                release += 1;
                memo.put(disChar,memo.get(disChar)-1);
                if(memo.get(disChar) == 0)
                {
                    memo.remove(disChar);
                    distinct -= 1;
                }
               
            }
            if(distinct == k)
            {
                answer =Math.max(answer,acquire - release +1) ; 
            }
           
        }
        return answer == 0 ? -1 :answer;
    }
}
```


## Problem Link

 - [geeksforgeeks](https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)
