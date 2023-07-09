
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
        int answer = 0;
        int left = 0;
        
        HashMap<Character, Integer> memo = new HashMap<>();
        
        for(int right = 0; right < s.length() ; right++){
            char currentChar = s.charAt(right);
            
            if(memo.containsKey(currentChar) && memo.get(currentChar) >= left){
                left = memo.get(currentChar) + 1;
            }
            
            int a = right - left + 1;
            memo.put(currentChar, right);
            answer = Math.max(answer, a);
        
        }
        
        return answer;
        
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
			     
// 		int answer = 0;
// 		int release = 0;
// 		int distinct = 0;
// 		HashMap<Character, Integer> memo = new HashMap<>();
// 		//
		
// 		for(int acquire = 0; acquire < s.legth();acquire++)
// 		{
// 		    Character currentChar = s.charAt(acquire);
		    
// 		    memo.put(currentChar,1);
		    
// 		    if(memo.containsKey(currentChar))
// 		    {
// 		        memo.put(currentChar,memo.get(currentChar) +1);
// 		    }
// 		    else
// 		    //
// 		    {
// 		        memo.put(curentChar,1);
// 		        distinct += 1;
// 		    }
		    
// 		    while(release <= acquire && distinct > k )
// 		    {
// 		      Character disChar = s.charAt(release);  
// 		      release += 1; 
// 		      memo.put(disChar,memo.get(disChar) -1);
// 		      if (memo.containsKey(disChar) == 0)
// 		      {
// 		          memo.remove(disChar);
// 		          distinct -= 1;
// 		      }
// 		      answer = Math.max(answer,acquire - release +1);
// 		    }
// 		}
		
// 		return answer;
//     }
// }

```


## Problem Link

 - [GFG](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

