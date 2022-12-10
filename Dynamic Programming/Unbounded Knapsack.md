
# Unbounded Knapsack

Given a set of N items, each with a weight and a value, represented by the array w[] and val[] respectively. Also, a knapsack with weight limit W.
The task is to fill the knapsack in such a way that we can get the maximum profit. Return the maximum profit.
Note: Each item can be taken any number of times.

 

##Java

```java
// Unoptimized Solution:
class Solution{
    static int knapSack(int N, int capacity, int val[], int wt[])
    {
        return maxProfit(N,capacity,val,wt,0);
    }
    
    private int maxProfit(int N, int capacity, int[] val, int[] wt, int currentindex){
        
        if (currentindex == N)
        return 0;
        
        if (capacity == 0)
        return 0;
        
        int currentitemweight = wt[currentindex];
        int currentitemvalue = val[currentindex];
        int consider = 0;
        
        if (currentitemweight <= capacity)
        consider = currentitemvalue + maxProfit(N,capacity - currentitemweight ,val,wt,currentindex);
        
      int notconsider =  maxProfit(N,capacity,val,wt,currentindex+1);
      return Math.max(consider,notconsider);
    }
}
```



