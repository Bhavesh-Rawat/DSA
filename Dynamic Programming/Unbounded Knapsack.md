
# Unbounded Knapsack

Given a set of N items, each with a weight and a value, represented by the array w[] and val[] respectively. Also, a knapsack with weight limit W.
The task is to fill the knapsack in such a way that we can get the maximum profit. Return the maximum profit.
Note: Each item can be taken any number of times.


 ##Unoptimized Solution(Brute Force):

##Java

```java
// Unoptimized Solution(Brute Force):
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

#Optimized Solution:

##Java

```java
// Optimized Solution:

class Solution{
    static int knapSack(int N, int capacity, int val[], int wt[])
    {
        int[][] array = new int[N][capacity+1];
        for(int i=0;i<N;i++)
        for(int j=0;j<capacity+1;j++)
        array [i][j] = -1;
        
        return maxProfit(N,capacity,val,wt,0,array);
    }
    
    private int maxProfit(int N, int capacity, int[] val, int[] wt, int currentindex, int[][] array){
        
        if (currentindex == N)
        return 0;
        
        if (capacity == 0)
        return 0;
        
        if(array[currentindex][capacity] != -1)
        return array[currentindex][capacity];
        
        int currentitemweight = wt[currentindex];
        int currentitemvalue = val[currentindex];
        int consider = 0;
        
        if (currentitemweight <= capacity)
        consider = currentitemvalue + maxProfit(N,capacity - currentitemweight ,val,wt,currentindex,array);
        
      int notconsider =  maxProfit(N,capacity,val,wt,currentindex+1,array);
    //   return Math.max(consider,notconsider);
    
    array[currentindex][capacity] = Math.max(consider,notconsider);
    return  array[currentindex][capacity];
    }
}
```







