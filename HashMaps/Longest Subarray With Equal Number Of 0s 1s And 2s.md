
# Longest Subarray With Equal Number Of 0s 1s And 2s

1. You are given an array that contains only 0s, 1s, and 2s.
2. You have to find length of the longest subarray with equal number of 0s, 1s, and 2s.

 
#
Example :

Input: 0 1 0 2 0 1 0

Output: 3

## Problem Link

 - [pepcoding](https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/longest-subarray-with-equal-number-of-0s-1s-and-2s-official/ojquestion)


## Code

```java
 public static int solution(int[] arr) {
        // write your code here

        
        int answer = 0;
          
        int z0 = 0;
        int z1 = 0;
        int z2 = 0;
        // initialization
        
        HashMap<String,Integer> memo = new HashMap<>();
        // Key is Character and Value is Frequency
        String expression = (z1 - z0)+ "#" + (z2 - z1);
        // "()" operator presidence and "#" as string to character
        
        memo.put(expression,1);
        // intializing entry to avoid corner cases
        
        for(int i = 0; i < arr.length; i++)
        // iterating over array
        {
            if (arr.charAt(i) == '0')
            // incrementing count of z0 if current index have '0' character
            {
                z0 += 1;
            }
            else if (arr.charAt(i) == '1')
            // incrementing count of z1 if current index have '1' character
            {
               z1 += 1; 
            }
            else 
            {
                z2 += 1;
            // incrementing count of z2 if current index have '2' character
            }
            
            expression = (z1 - z0)+ "#" +(z2 - z1);
            // calculating expression with updated values of z0,z1,z2 to update/enter in Hash Map
            
            if(memo.containsKey(expression))
            // if there is already entry in hash map
            {
                answer = Math.max(answer,i -memo.get(expression)) ;
                memo.put(expression,memo.get(expression)+1);
                // increment its frequency
            }
            else
            {
                 memo.put(expression,1);
                 // enter frequecy if not present
            } 
          
            
        }
        return answer;
    }
```



