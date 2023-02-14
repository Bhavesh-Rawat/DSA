
# Largest subarray with 0 sum

Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
Your Task:
You just have to complete the function maxLen() which takes two arguments an array A and n, where n is the size of the array A and returns the length of the largest subarray with 0 sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 105
-1000 <= A[i] <= 1000, for each valid i



## Problem Link

https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
## Code

```java

class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> memo = new HashMap<>();
        int prefixSum = 0;
        int answer = 0;
        
        memo.put(prefixSum, -1);
        
        for(int i = 0; i < n; i++){
            int currentVal = arr[i];
            prefixSum += currentVal;
            
            if(memo.containsKey(prefixSum)){
                int temp = i - memo.get(prefixSum);
                answer = Math.max(answer, temp);
            }
            else{
                memo.put(prefixSum, i);
            }
        }
        
        return answer;
        
    }
}