
# Count Of Substrings Having At Most K Unique Characters

1. You are given a string(str) and a number K.
2. You have to find the count of substrings of the given string that contains at most K unique characters.

 
#
Example 1:

Input: aabcbcdbca

Output: 23




## Code

```java

public static int getLengthofLongestSubstring(String s,int k ) {
		// Write your code here.
			
		HashMap<Character,Integer> memo = new HashMap<>();
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
		      answer += acquire - release +1;
		    }
		}
		
		return answer;
	}

```


## Problem Link

 - [pepcoding](https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/count-of-substrings-having-at-most-k-unique-characters-official/ojquestion)

 - [geeksforgeeks](https://www.geeksforgeeks.org/count-number-of-substrings-having-at-least-k-distinct-characters/)