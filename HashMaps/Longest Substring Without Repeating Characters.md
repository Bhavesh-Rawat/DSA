
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
class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
       HashMap<Long, Long> memo = new HashMap<>();
       long ans = 0;
       long prefixSum = 0;
       
       memo.put(0L,1L);
       
      for(int i=0; i<n; i++){
            long currentVal = arr[i];
            prefixSum += currentVal;
            
            if(memo.containsKey(prefixSum)){
                long k = memo.get(prefixSum);
                ans+=k;
                memo.put(prefixSum, k + 1);
                
            }
            else{
                memo.put(prefixSum, 1L);
            }
        }
        
        return ans;
    }
}

```


## Problem Link

 - [GFG](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

