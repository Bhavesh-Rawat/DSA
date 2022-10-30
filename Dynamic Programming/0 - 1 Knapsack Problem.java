// gfg link for prblm 👇
// https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

// '😤' Brute Force 👇 Obviusly TA
// class Solution 
// { 
//     //Function to return max value that can be put in knapsack of capacity W.
//     public int knapSack(int capacity, int wt[], int val[], int n) 
//     { 
//       return maxProfit(wt, val, 0, capacity, n);
//     } 
//     private int maxProfit (int[] weight, int[] profit, int currentItem,int capacity,int n) 
//     {
//         if(currentItem == n)
//         return 0;
        
//         int currentItemWeight = weight[currentItem];
//         int currentItemProfit = profit[currentItem];
//         int consider = 0;
        
//         if(currentItemWeight <= capacity)                👇required things to get profit  
//         consider = currentItemProfit + maxProfit(weight,profit,currentItem+1,capacity,n);
        
//         int notConsider = maxProfit(weight,profit,currentItem+1,capacity,n);
        
//         return Math.max(consider,notConsider);
//     }
// }

class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int capacity, int weights[], int values[], int n) 
    { 
         return maxProfit(weights,values,capacity,n,0,new HashMap<String,Integer>());
    }                                                                                                  
                                                                                                    //    👇<currentKey, Value>
   
    public static int maxProfit(int[] weights,int[] values,int capacity,int n,int currentItem,HashMap<String,Integer> memo)
    {
        if(currentItem >= n)
            return 0;

                //         As 2 key are there if they are integer they may conflict and mispatch 
                //   👇      thus making it String         // 👇Delimiter/separator
                                                            
        String currentKey = Integer.toString(currentItem) + "_" + Integer.toString(capacity);
        //concating keys in above line
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int consider = 0;
        if(weights[currentItem] <= capacity){
            consider = values[currentItem] + maxProfit(weights, values, capacity - weights[currentItem], n, currentItem + 1,memo);
        } 
        
        int notConsider = maxProfit(weights, values, capacity, n, currentItem + 1,memo);
        
        memo.put(currentKey,Math.max(consider,notConsider));
        
        return memo.get(currentKey);
    }
}