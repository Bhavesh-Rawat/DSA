
# Count distinct elements in every window

Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.
#
Example 1:

Input:

N = 7, K = 4
A[] = {1,2,1,3,4,2,3}

Output: 

3 4 4 3

#
Explanation: 
Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 3.
Window 2 of size k = 4 is 2 1 3 4. Number
of distinct elements in this window are 4.
Window 3 of size k = 4 is 1 3 4 2. Number
of distinct elements in this window are 4.
Window 4 of size k = 4 is 3 4 2 3. Number
of distinct elements in this window are 3.

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

 - [GFG](https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1#)

