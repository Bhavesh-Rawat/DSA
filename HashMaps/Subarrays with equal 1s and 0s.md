
# Subarrays with equal 1s and 0s

Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.

#
Example 1:

Input:
n = 7     
A[] = {1,0,0,1,0,1,1}


Output: 8

Explanation : The index range for the 8 
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
(4, 5) ,(2, 5), (0, 5), (1, 6)

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

 - [GFG](https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1)

