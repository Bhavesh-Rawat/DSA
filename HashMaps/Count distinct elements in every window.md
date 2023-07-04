
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


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> memo = new HashMap<>();
        int distinct = 0;
 
        for(int i = 0; i < k; i++){
            int currentVal = A[i];
 
            if(memo.containsKey(currentVal)){
                memo.put(currentVal, memo.get(currentVal)+1);
            }else{
                memo.put(currentVal, 1);
                //distinct += 1;
            }
        }
 
        answer.add(memo.size());
        int release = 0;
 
        for(int acquire = k; acquire < n; acquire++){
            int discardElement = A[release];
            memo.put(discardElement, memo.get(discardElement)-1);
            release += 1;
 
            if(memo.get(discardElement) == 0){
                memo.remove(discardElement);
                //distinct-= 1;
            }
 
            int currentVal = A[acquire];
 
            if(memo.containsKey(currentVal)){
                memo.put(currentVal, memo.get(currentVal)+1);
            }else{
                memo.put(currentVal, 1);
                distinct += 1;
            }
 
            answer.add(memo.size());
        }
 
        return answer;
    }
}

// class Solution
// {
//     ArrayList<Integer> countDistinct(int A[], int n, int k)
//     {
//         // code here 
//         ArrayList<Integer> answer = new ArrayList<Integer>();
//         HashMap<Integer,Integer> memo = new HashMap<Integer,Integer>();
//         int distinct = 0;
        
//         for(int i = 0; i < k; i++)
//         {
//             int currentVal = A[i];
//             if(memo.containsKey(currentVal))
//             {
//                 memo.put(currentVal, memo.get(currentVal)+1);
//             } else 
//             {
//                 memo.put(currentVal,1);
//                 distinct += 1;
//                 // incrementing distinct value based on hasmap value (ditinct frequency)
//             }
           
//         }
//          answer.add(distinct);
//             // adding distinct value based on hasmap value (ditinct frequency)
            
//         int release = 0;
//         for(int acquire = 0; acquire< n ;acquire++)
//         // second pointer to iterate array
//         {
//             int discardElement = A[release];
//             memo.put(discardElement , memo.get(discardElement)-1);
//             release += 1;
            
//             if (memo.get(discardElement) == 0)
//             {
//                 memo.remove(discardElement);
//                 // remove from map if frequency is zero 
//                 distinct -= 1;
//             }
            
//             int currentVal = A[acquire];
//             if (memo.containsKey(currentVal)){
//                 memo.put(currentVal, memo.get(currentVal)+1);
//             } else {
//                 memo.put(currentVal,1);
//                 distinct += 1;
//             }
//             answer.add(distinct);
//         }
        
//         return answer;
//     }
// }


```


## Problem Link

 - [GFG](https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1#)

