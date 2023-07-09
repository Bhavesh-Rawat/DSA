
# Longest Subarray With Equal Number Of 0s 1s And 2s

1. You are given an array that contains only 0s, 1s, and 2s.
2. You have to find length of the longest subarray with equal number of 0s, 1s, and 2s.

 
#
Example :

Input: 0 1 0 2 0 1 0

Output: 3




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

 - [pepcoding](https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/longest-subarray-with-equal-number-of-0s-1s-and-2s-official/ojquestion)
