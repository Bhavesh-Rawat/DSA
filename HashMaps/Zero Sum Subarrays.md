
# Zero Sum Subarrays

You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.


Example 1:

Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are 
[0], [0], [0], [0], [0,0], and [0,0].

## Usage/Examples

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

 - [GFG](https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1)

