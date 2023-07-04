
# Longest Substring Without Repeating Characters

Given a string s, find the length of the longest 
substring
 without repeating characters.

 
#
Example 1:

Input: s = "abcabcbb"

Output: 3

Explanation: The answer is "abc", with the length of 3.

## Code

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
          HashMap<Character,Integer> memo = new HashMap<> ();
        
        int answer = 0;
        int release = 0;

        for(int acquire =0; acquire< s.length();acquire++)
        {
          Character currentChar = s.charAt(acquire);

          while (release < acquire && memo.containsKey(currentChar))
          {
              Character disChar = s.charAt(release);
             
                  memo.remove(disChar);
                  release += 1;
          }

              memo.put(currentChar,1);
              answer = Math.max(answer,acquire-release+1); 
              
          
        }
        return answer;
    }
}

```


## Problem Link

 - [GFG](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

