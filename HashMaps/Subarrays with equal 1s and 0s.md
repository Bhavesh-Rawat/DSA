
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
class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        HashMap<Integer, Integer> memo = new HashMap<>();
        int prefixSum = 0;
        int ans = 0;
        memo.put(0, 1);
        
        for(int i=0; i<n; i++){
            int currentVal = arr[i];
            if(currentVal == 0){
                prefixSum += -1;
            }
            else{
                prefixSum += 1;
            }
            
            if(memo.containsKey(prefixSum)){
                int j = memo.get(prefixSum);
                ans+=j;
                memo.put(prefixSum, j + 1);
                
            }
            else{
                memo.put(prefixSum, 1);
            }
        }
        
        return ans;
    }
}

```


## Problem Link

 - [GFG](https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1)

