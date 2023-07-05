
# Longest Substring with At Most K Distinct Characters

Given a string S, find the length of the longest substring T that contains at most k distinct characters.

 
#
Example 1:

Input: S = "eceba" and k = 3

Output: 4

Explanation: T = "eceb"



## Code

```java

public class Solution {
    /**
     * @param s: A string
     * @param k: An integer
     * @return: An integer
     */
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // write your code here
          HashMap<Character, Integer> memo = new HashMap<>();
		int answer = 0;
		int release = 0;
		int distinct = 0;
		//
		
		for(int acquire = 0; acquire < s.length();acquire++)
		{
		    Character currentChar = s.charAt(acquire);
		    
		    if(memo.containsKey(currentChar))
		    {
		        memo.put(currentChar,memo.get(currentChar) +1);
		    }
		    else
		    //
		    {
		        memo.put(currentChar,1);
		        distinct += 1;
		    }
		    
		    while(release <= acquire && distinct > k )
		    {
		      Character disChar = s.charAt(release);  
		      release += 1; 
		      memo.put(disChar,memo.get(disChar) -1);
		      if (memo.get(disChar) == 0)
		      {
		          memo.remove(disChar);
		          distinct -= 1;
		      }
		     
		    }
			 answer = Math.max(answer,acquire - release +1 );
		}
		
		return answer;
    }
}
```


## Problem Link

 - [lintcode](https://www.lintcode.com/problem/386/)

 - [leetcode](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/)